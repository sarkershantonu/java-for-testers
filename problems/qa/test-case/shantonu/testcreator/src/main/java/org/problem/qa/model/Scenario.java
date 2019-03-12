package org.problem.qa.model;

import org.problem.qa.model.TestRequest;
import org.problem.qa.model.TestResult;

public class Scenario {
    private Long id;
    private String name;
    private TestRequest request;
    private TestResult result;


    public TestRequest getRequest() {
        return request;
    }

    public void setRequest(TestRequest request) {
        this.request = request;
    }

    public TestResult getResult() {
        return result;
    }

    public void setResult(TestResult result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Scenario(Long id, String name, TestRequest request, TestResult result) {
        this.id = id;
        this.name = name;
        this.request = request;
        this.result = result;
    }

    @Override
    public String toString() {
        return "\nScenario : " +
                "id=" + id +
                ", name=" + name  +
                ", request=" + request.toString() +
                ", result=" + result.toString() ;
    }
}
