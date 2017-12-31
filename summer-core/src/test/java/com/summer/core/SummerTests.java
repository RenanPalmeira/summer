package com.summer.core;

import com.summer.core.models.Field;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by renanpalmeira on 28/12/17.
 */
public class SummerTests {

    private Summer client;

    @Before
    public void setUp() {
        this.client = new Summer();
    }

    @Test
    public void testGetFields() throws Exception {
        client
            .getFields()
            .forEach(field -> System.out.println(field.getName() + ' ' + field.getType()));
    }

    @Test
    public void testAddField() {
        client.setField(new Field("field", "text_general"));
    }

}