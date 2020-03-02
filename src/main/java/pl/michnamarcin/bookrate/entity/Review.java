package pl.michnamarcin.bookrate.entity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "id_user")
    private User id_user;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book id_book;

    private String review;

    private int rate;

    public Review()
    {
    }

    @Override
    public String toString()
    {
        return "Review{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", id_book=" + id_book +
                ", review='" + review + '\'' +
                ", rate=" + rate +
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

    public User getId_user()
    {
        return id_user;
    }

    public void setId_user(User id_user)
    {
        this.id_user = id_user;
    }

    public Book getId_book()
    {
        return id_book;
    }

    public void setId_book(Book id_book)
    {
        this.id_book = id_book;
    }

    public String getReview()
    {
        return review;
    }

    public void setReview(String review)
    {
        this.review = review;
    }

    public int getRate()
    {
        return rate;
    }

    public void setRate(int rate)
    {
        this.rate = rate;
    }
}
