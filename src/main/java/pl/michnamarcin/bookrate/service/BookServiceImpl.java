package pl.michnamarcin.bookrate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.michnamarcin.bookrate.dao.BookDAO;
import pl.michnamarcin.bookrate.entity.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService
{
    private BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO bookDAO)
    {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public List<Book> findAll()
    {
        return bookDAO.findAll();
    }

    @Override
    @Transactional
    public Book findById(int id)
    {
        return bookDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Book book)
    {
        bookDAO.save(book);
    }

    @Override
    @Transactional
    public void delete(int id)
    {
        bookDAO.delete(id);
    }

    @Override
    @Transactional
    public List<Book> findByTitleOrAuthor(String reg)
    {
        return bookDAO.findByTitleOrAuthor(reg);
    }
}
