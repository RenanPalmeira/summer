package com.summer.core;

import java.util.List;
import com.summer.core.client.SolrClient;
import com.summer.core.client.DefaultSolrClient;


public class SummerClient {

    private SolrClient solrClient = new DefaultSolrClient();

    public List<Field> listFields() {
        return solrClient.loadFromEndpoint("/schema/fields");
    }
}