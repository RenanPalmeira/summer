package com.summer.core;

import java.util.List;
import com.summer.core.client.SolrClient;
import com.summer.core.models.AddField;
import com.summer.core.models.Field;

/**
 * Created by renanpalmeira on 28/12/17.
 */
public class Summer {

    private final SchemaClientApi schemaClientApi;

    public Summer() {
        this.schemaClientApi = new SolrClient().getSchemaClientApi();
    }

    public List<Field> getFields() {
        return schemaClientApi
                .entryFields()
                .getFields();
    }

    public void setField(Field field) {
        schemaClientApi.addField(new AddField(field));
    }
}