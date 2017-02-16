package com.jetbrains.neo4j;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.template.Neo4jTemplate;

import java.util.Map;

public class SDN4Injection {

    private Neo4jTemplate neo4jTemplate;
    private Map<String, Object> params;

    private void testInjection() {
        neo4jTemplate.query("MATCH (n) RETURN n", params);
        neo4jTemplate.query("MATCH (n) RETURN n", params, true);
        neo4jTemplate.queryForObject(Class.class, "MATCH (n) RETURN n", params);
        neo4jTemplate.queryForObjects(Class.class, "MATCH (n) RETURN n", params);
    }

    @Query(value = "MATCH (n) RETURN n", countQuery = "MATCH (n) RETURN n")
    private void testAnnotationInject() {
    }
}
