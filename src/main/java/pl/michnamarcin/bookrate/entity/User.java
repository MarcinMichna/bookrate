package pl.michnamarcin.bookrate.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String passw;

    @Column(name = "creation_date")
    private Date creationDate;


    public User()
    {
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passw='" + passw + '\'' +
                ", creationDate=" + creationDate +
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

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassw()
    {
        return passw;
    }

    public void setPassw(String passw)
    {
        this.passw = passw;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }
}
