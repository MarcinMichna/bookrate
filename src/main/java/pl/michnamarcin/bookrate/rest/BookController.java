package pl.michnamarcin.bookrate.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.michnamarcin.bookrate.entity.Book;
import pl.michnamarcin.bookrate.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/")
public class BookController
{
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService)
    {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book>findAll(@RequestParam(name = "search", defaultValue = "null", required = false) String search)
    {
        if(search.equals("null"))
            return bookService.findAll();
        else
            return bookService.findByTitleOrAuthor(search);
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id)
    {
        return bookService.findById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book)
    {
        book.setId(0);
        bookService.save(book);
        return book;
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book)
    {
        bookService.save(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id)
    {
        Book tmp = bookService.findById(id);
        bookService.delete(id);
        return "Book with id = " + id + " was deleted";
    }
}
