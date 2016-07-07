package net.cocoalatte.domain;


import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @ManyToOne(targetEntity = Author.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private Author author;

    @ManyToOne(targetEntity = Publisher.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher")
    private Publisher publisher;

    @Column(name = "title")
    private String title;

    @Column(name = "page")
    private int page;

    @Column(name = "volume")
    private String volume;

    @Column(name = "isbn13")
    private String isbn13;

    @Column(name = "isbn10")
    private String isbn10;

    @Column(name = "description", nullable = true)
    private String description;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author=" + author +
                ", publisher=" + publisher +
                ", title='" + title + '\'' +
                ", page=" + page +
                ", volume='" + volume + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", isbn10='" + isbn10 + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
