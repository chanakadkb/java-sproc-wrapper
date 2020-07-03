package org.zalando.sprocwrapper.example;

import java.util.List;

import org.zalando.typemapper.annotations.DatabaseField;

public class WrapperLookupSchema {

    @DatabaseField
    public int count;

    @DatabaseField
    public List<LookupTypeSchema> schema1;

    @DatabaseField
    public List<LookupTypeSchema> schema2;

}
