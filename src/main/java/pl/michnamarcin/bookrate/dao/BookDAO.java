package pl.michnamarcin.bookrate.dao;

import pl.michnamarcin.bookrate.entity.Book;

import java.util.List;

public interface BookDAO
{
    List<Book> findAll();

    Book findById();

    void save(Book book);

    void delete(int id);

    List<Book> findByTitleOrAuthor();
}
