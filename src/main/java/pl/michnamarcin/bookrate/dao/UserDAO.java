package pl.michnamarcin.bookrate.dao;

import pl.michnamarcin.bookrate.entity.User;

import java.util.List;

public interface UserDAO
{
    List<User> findAll();

    User findById(int id);

    void save(User user);

    void delete(int id);
}
