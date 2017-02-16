package com.jetbrains.neo4j;

import org.neo4j.ogm.session.Session;

import java.util.Map;

public class Neo4jOgmInjection {

    private Session session;
    private Map<String, Object> params;

    private void testInjection() {
        session.queryForObject(Neo4jOgmInjection.class, "MATCH (n) RETURN n", params);
        session.query(Neo4jOgmInjection.class, "MATCH (n) RETURN n", params);
        session.query("MATCH (n) RETURN n", params);
        session.query("MATCH (n) RETURN n", params, true);
    }
}
