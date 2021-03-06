package pl.michnamarcin.bookrate.dao;

import pl.michnamarcin.bookrate.entity.Book;

import java.util.List;

public interface BookDAO
{
    List<Book> findAll();

    Book findById(int id);

    void save(Book book);

    void delete(int id);

    List<Book> findByTitleOrAuthor(String reg);
}
