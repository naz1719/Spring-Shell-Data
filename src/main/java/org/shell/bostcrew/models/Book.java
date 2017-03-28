package org.shell.bostcrew.models;

import org.shell.bostcrew.core.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nazar on 28.03.17.
 */
@Document(collection = "books")
public class Book extends AbstractDocument {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Book() {
    }

    public Book(String name) {
        this.name = name;
    }
}
