package org.problem.qa;

import java.time.LocalDate;

public class TestResult {
    private Long id;
    private String requestType;
    private String response;
    private Boolean success;

    public TestResult(Long id, String requestType, String response, Boolean success) {
        this.id = id;
        this.requestType = requestType;
        this.response = response;
        this.success = success;
    }
}
