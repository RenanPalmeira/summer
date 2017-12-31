package com.summer.core.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by renanpalmeira on 31/12/17.
 */
public class AddField {

    @JsonProperty("add-field")
    private Field field;

    public AddField() {}

    public AddField(Field field) {
        this.field = field;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

}
