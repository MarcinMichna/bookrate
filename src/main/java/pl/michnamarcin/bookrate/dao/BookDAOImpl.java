package pl.michnamarcin.bookrate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.michnamarcin.bookrate.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO
{
    private EntityManager entityManager;

    @Autowired
    public BookDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    public List<Book> findAll()
    {
        Query query = entityManager.createQuery("from Book");
        return query.getResultList();
    }

    @Override
    public Book findById(int id)
    {
        return entityManager.find(Book.class, id);
    }

    @Override
    public void save(Book book)
    {
        entityManager.persist(book);
    }

    @Override
    public void delete(int id)
    {
        Query query = entityManager.createQuery("delete from Book where id=:id").setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public List<Book> findByTitleOrAuthor(String reg)
    {
        Query query = entityManager.createQuery("from Book where lower(title) like lower(:reg) or lower(author) like lower(:reg)").setParameter("reg", "%" + reg + "%");
        return query.getResultList();
    }
}
