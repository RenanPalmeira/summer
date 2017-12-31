package com.summer.core;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import com.summer.core.models.AddField;
import com.summer.core.models.Field;
import com.summer.core.models.FieldWrapper;

/**
 * Created by renanpalmeira on 31/12/17.
 */
public interface SchemaClientApi {

    @RequestLine("POST /schema")
    @Headers("Content-Type: application/json")
    void addField(AddField schema);

    @RequestLine("GET /schema/fields")
    FieldWrapper entryFields();

    @RequestLine("GET /schema/fields/{fieldname}")
    Field entryField(@Param("fieldname") String fieldname);
}