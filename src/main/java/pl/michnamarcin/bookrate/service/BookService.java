package pl.michnamarcin.bookrate.service;

import pl.michnamarcin.bookrate.entity.Book;

import java.util.List;

public interface BookService
{
    List<Book> findAll();

    Book findById(int id);

    void save(Book book);

    void delete(int id);

    List<Book> findByTitleOrAuthor(String reg);
}
