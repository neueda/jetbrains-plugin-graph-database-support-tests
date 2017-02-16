package com.jetbrains.neo4j;

import org.neo4j.graphdb.GraphDatabaseService;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Neo4jGraphDatabaseServiceInjection {

    private GraphDatabaseService db;
    private Map<String, Object> params;

    public void execute() {
        db.execute("MATCH (n) RETURN n");
        db.execute("MATCH (n) RETURN n", 1, TimeUnit.SECONDS);
        db.execute("MATCH (n) RETURN n", params);
        db.execute("MATCH (n) RETURN n", params, 1, TimeUnit.SECONDS);
    }
}
