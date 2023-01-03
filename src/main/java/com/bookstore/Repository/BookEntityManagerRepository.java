package com.bookstore.Repository;

import com.bookstore.entity.Book;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository

public class BookEntityManagerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Book save(Book book) {
        entityManager.persist(book);
        return book;
    }

    public Book findById(long id) {
        Book tutorial = (Book) entityManager.find(Book.class, id);
        return tutorial;
    }

    @Transactional
    public Book update(Book tutorial) {
        entityManager.merge(tutorial);
        return tutorial;
    }

    @Transactional
    public Book deleteById(long id) {
        Book tutorial = findById(id);
        if (tutorial != null) {
            entityManager.remove(tutorial);
        }

        return tutorial;
    }

    @Transactional
    public int deleteAll() {
        Query query = entityManager.createQuery("DELETE FROM Tutorial");
        return query.executeUpdate();
    }


}
