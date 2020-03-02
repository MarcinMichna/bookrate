package pl.michnamarcin.bookrate.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "book")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String author;

    @Column(name = "first_edition")
    private Date firstEdition;

    private String description;

    public Book()
    {
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", firstEdition=" + firstEdition +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Date getFirstEdition()
    {
        return firstEdition;
    }

    public void setFirstEdition(Date firstEdition)
    {
        this.firstEdition = firstEdition;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
