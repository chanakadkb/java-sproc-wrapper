package org.zalando.sprocwrapper.example;

import org.zalando.typemapper.annotations.DatabaseField;
import org.zalando.typemapper.annotations.DatabaseType;

@DatabaseType(name = "partial_object")
public class NotPartialObject {

    @DatabaseField
    private int id;
    @DatabaseField
    private String name;

    public void setId(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
