package models;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table (name = "ad_images")
public class Adimage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "ad_id")
    private Ad ad;

    public AdImage(){};

    public Adimage(long id, String path, String description, Ad ad) {
        this.id = id;
        this.path = path;
        this.description = description;
        this.ad = ad;
    }

    public Adimage(String path, String description, Ad ad) {
        this.path = path;
        this.description = description;
        this.ad = ad;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
