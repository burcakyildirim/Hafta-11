import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "borrowings")
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrower_id",columnDefinition = "serial")
    private Long id;

    @Column(name = "borrower_name",nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_on_date",nullable = false)
    private LocalDate onDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowReturn_date",nullable = false)
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrowing_book_id", referencedColumnName = "book_id")
    private Book book;

    public Borrowing() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDate onDate) {
        this.onDate = onDate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Borrowing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", onDate=" + onDate +
                ", date=" + date +
                ", book=" + book +
                '}';
    }
}
