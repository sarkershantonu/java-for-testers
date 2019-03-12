package org.problem.qa;

import java.time.LocalDate;

public class TestRequest {

    private LocalDate startDate;
    private LocalDate endDate;
    private Status status;
    private Long id;

    public TestRequest(LocalDate startDate, LocalDate endDate, Status status, Long id) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.id = id;
    }
}
