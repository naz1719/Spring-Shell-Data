package org.shell.bostcrew.core;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by nazar on 28.03.17.
 */
public class AbstractDocument {
    @Id
    private ObjectId id = new ObjectId();

    public ObjectId getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
