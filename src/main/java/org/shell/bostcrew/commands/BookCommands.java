package org.shell.bostcrew.commands;

import org.shell.bostcrew.models.Book;
import org.shell.bostcrew.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 * Created by nazar on 29.03.17.
 */
@Component
public class BookCommands implements CommandMarker {
    @Autowired
    BookRepository bookRepository;

    @CliCommand(value = "book add", help = "This option add book to database")
    public String add(
            @CliOption(key = {"title"}, mandatory = true, help = "Title of book", specifiedDefaultValue = "Harry Potter") final String title) {
        bookRepository.save(new Book(title));
        return "Book = [" + title + "] ";
    }
    @CliCommand(value = "book list", help = "This option show all books")
    public void  list(){
        bookRepository.findAll(new Sort(Sort.Direction.ASC,"title")).forEach(System.out::println);
    }
    @CliCommand(value = "book remove", help = "This option remove a book")
    public String remove(
            @CliOption(key = {"title"}, mandatory = true, help = "Title of book", specifiedDefaultValue = "Harry Potter") final String title) {
        bookRepository.delete(bookRepository.findByTitle(title));
        return "Book = [" + title + "] deleted ";
    }


}
