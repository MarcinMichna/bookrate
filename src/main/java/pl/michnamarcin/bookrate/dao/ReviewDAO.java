package pl.michnamarcin.bookrate.dao;

import java.util.List;

public interface ReviewDAO
{
    List<ReviewDAO> findAll();

    List<ReviewDAO> findByUser(String username);

    List<ReviewDAO> findByBook(int id);

    ReviewDAO findById(int id);

}
