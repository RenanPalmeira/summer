package com.summer.core.client;

import java.util.List;
import com.summer.core.Field;


public interface SolrClient {
    List<Field> loadFromEndpoint(String endpoint);
}