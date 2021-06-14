package models;


import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToOne
    private User owner;


    public Ad() {}

    //  Insert for Creating new add
    public Ad(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.owner = user;
    }

    // Read Constructor
    public Ad(long id, String title, String description, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.owner = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
