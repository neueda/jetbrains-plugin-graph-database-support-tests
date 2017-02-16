package com.jetbrains.neo4j;

import org.neo4j.harness.TestServerBuilder;
import org.neo4j.harness.TestServerBuilders;
import org.neo4j.harness.junit.Neo4jRule;

public class Neo4jHarnessInjection {

    private Neo4jRule rule = new Neo4jRule()
            .withFixture("MATCH (n) RETURN n");

    private TestServerBuilder builder = TestServerBuilders.newInProcessBuilder()
            .withFixture("MATCH (n) RETURN n");
}
