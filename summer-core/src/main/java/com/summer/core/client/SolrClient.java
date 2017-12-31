package com.summer.core.client;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import com.summer.core.SchemaClientApi;

/**
 * Created by renanpalmeira on 31/12/17.
 */
public class SolrClient {

    public SchemaClientApi getSchemaClientApi() {
        return Feign
                .builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .target(SchemaClientApi.class, "http://localhost:8983/solr/collection1/");
    }
}