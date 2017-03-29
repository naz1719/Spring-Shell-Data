package org.shell.bostcrew.models;

import org.shell.bostcrew.core.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nazar on 28.03.17.
 */
@Document(collection = "books")
public class Book extends AbstractDocument {
    private String title;

    private Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
