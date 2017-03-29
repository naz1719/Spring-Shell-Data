package org.shell.botscrew.models;

import org.shell.botscrew.core.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nazar on 28.03.17.
 */
@Document(collection = "books")
public class Book extends AbstractDocument {
    private String title;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    private Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
