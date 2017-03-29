package org.shell.botscrew.repository;

import org.bson.types.ObjectId;
import org.shell.botscrew.models.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by nazar on 28.03.17.
 */
public interface BookRepository  extends PagingAndSortingRepository<Book, ObjectId> {
    List<Book> findByTitle(String title);
    Book findByTitleOrAuthor(String title);
    Book findByAuthor(String author);
}
