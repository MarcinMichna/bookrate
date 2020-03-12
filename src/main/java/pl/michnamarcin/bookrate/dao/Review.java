package pl.michnamarcin.bookrate.dao;

import java.util.List;

public interface Review
{
    List<Review> findAll();

    List<Review> findByUser(String username);

    List<Review> findByBook(int id);

    Review findById(int id);

}
