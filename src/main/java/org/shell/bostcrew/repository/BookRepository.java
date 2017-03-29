package org.shell.bostcrew.repository;

import org.shell.bostcrew.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nazar on 28.03.17.
 */
public interface BookRepository  extends MongoRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
