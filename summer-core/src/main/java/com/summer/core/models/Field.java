package com.summer.core.models;

/**
 * Created by renanpalmeira on 28/12/17.
 */
public class Field {
    /**
     * Field Properties
     * @see https://lucene.apache.org/solr/guide/7_1/defining-fields.html#field-properties
     */
    private String name;
    private String type;

    /**
     * Optional Field Type
     * @see https://lucene.apache.org/solr/guide/7_1/defining-fields.html#optional-field-type-override-properties
     */
    private boolean indexed = true;
    private boolean stored = true;
    private boolean multiValued = false;
    private boolean required = false;

    public Field() {}

    public Field(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIndexed() {
        return indexed;
    }

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }

    public boolean getStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    public boolean getMultiValued() {
        return multiValued;
    }

    public void setMultiValued(boolean multiValued) {
        this.multiValued = multiValued;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }


}