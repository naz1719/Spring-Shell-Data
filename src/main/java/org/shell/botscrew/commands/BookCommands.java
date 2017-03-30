package org.shell.botscrew.commands;

import org.shell.botscrew.models.Book;
import org.shell.botscrew.repository.BookRepository;
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
            @CliOption(key = {"title"}, mandatory = true, help = "Title of book", specifiedDefaultValue = "Harry Potter") final String title,
            @CliOption(key = {"author"}, mandatory = true, help = "Author of book", specifiedDefaultValue = "Harry Potter") final String author) {
        bookRepository.save(new Book(title, author));
        return "Book = [" + title + "] [" + author + "]";
    }

    @CliCommand(value = "book list", help = "This option show all books")
    public void list() {
        bookRepository.findAll(new Sort(Sort.Direction.ASC, "title")).forEach(System.out::println);
    }

    @CliCommand(value = "book remove", help = "This option remove a book")
    public String remove(
            @CliOption(key = {"title"}, mandatory = true, help = "Title of book", specifiedDefaultValue = "Harry Potter") final String title) {
        bookRepository.delete(bookRepository.findByTitle(title));
        return "Book = [" + title + "] deleted ";
    }

    @CliCommand(value = "book edit", help = "This option edit a book")
    public String edit(
            @CliOption(key = {"author"}, mandatory = true, help = "Author of book", specifiedDefaultValue = "Harry Potter") final String author,
            @CliOption(key = {"newAuthor"}, mandatory = true, help = "Author of book", specifiedDefaultValue = "Harry Potter") final String newAuthor) {

        Book book = bookRepository.findByAuthor(author);
        book.setAuthor(newAuthor);
        bookRepository.save(book);
        return "Book = old author [" + author + "] new author [" + newAuthor + "]";
    }
    @CliCommand(value = "book deleteAll", help = "This option delete all books")
    public void deleteAll(){
        bookRepository.deleteAll();
    }

}
