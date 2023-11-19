import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        /* Author author = new Author();
        author.setName("May Alcott");
        author.setOnDate(LocalDate.now());
        author.setCountry("Amerika");
        entityManager.persist(author);

        Publisher publisher = new Publisher();
        publisher.setName("iş bankası");
        publisher.setEstablishmentYear(1977);
        publisher.setAddress("amerika/seattle");
        entityManager.persist(publisher);

        Book book = new Book();
        book.setName("Küçük Kadınlar");
        book.setPublicationYear(1977);
        book.setStock(10);
        book.setAuthor(author);
        book.setPublisher(publisher);
        entityManager.persist(book);

        Borrowing borrowing = new Borrowing();
        borrowing.setName("burçak");
        borrowing.setOnDate(LocalDate.now());
        borrowing.setDate(LocalDate.now());
        borrowing.setBook(book);
        entityManager.persist(borrowing);

        Category drama = new Category("Drama","asbxajba");
        entityManager.persist(drama);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(drama);
        book.setCategoryList(categoryList);

        entityManager.persist(book);
         */


        transaction.commit();
    }
}