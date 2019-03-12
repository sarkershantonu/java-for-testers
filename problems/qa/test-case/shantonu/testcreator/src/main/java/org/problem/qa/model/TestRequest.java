package org.problem.qa.model;

public class TestRequest {

    private String startDate;
    private String endDate;
    private String status;
    private String id;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TestRequest(String startDate, String endDate, String status, String id) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestRequest{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                ", id=" + id + '}';
    }
}
