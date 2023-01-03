package com.bookstore.Repository;

import com.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
@Query("SELECT b FROM Book b where b.author=:name")
List<Book> findbooksbyname(@Param("name") String name);

//@Query("Delete b from book b where b.id=:ids")
//    List<Integer> deletebooksbyids(List<Integer> id);



}
