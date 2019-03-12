package org.problem.qa.model;

import java.time.LocalDate;

public class TestResult {
    private String id;
    private String requestType;
    private String response;
    private Boolean success;
    public TestResult(){}
    public TestResult(String id, String requestType, String response, Boolean success) {
        this.id = id;
        this.requestType = requestType;
        this.response = response;
        this.success = success;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", requestType='" + requestType + '\'' +
                ", response='" + response + '\'' +
                ", success=" + success +
                '}';
    }
}
