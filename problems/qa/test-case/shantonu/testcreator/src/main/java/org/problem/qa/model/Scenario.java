package org.problem.qa;

public class Scenario {
    private TestRequest request;
    private TestResult result;
    private String name;
    private Long id;

    public Scenario(TestRequest request, TestResult result, String name, Long id) {
        this.request = request;
        this.result = result;
        this.name = name;
        this.id = id;
    }

}
