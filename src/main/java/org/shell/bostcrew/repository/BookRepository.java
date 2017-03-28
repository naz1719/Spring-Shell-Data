package org.shell.bostcrew.repository;

import org.shell.bostcrew.models.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nazar on 28.03.17.
 */
public interface BookRepository  extends CrudRepository<Book, Long> {
}
