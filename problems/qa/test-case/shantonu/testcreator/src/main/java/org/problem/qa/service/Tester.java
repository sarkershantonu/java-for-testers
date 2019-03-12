package org.problem.qa;

public class Tester {
    public static Scenario getResult(TestRequest request){
        Scenario result = new Scenario();

        if()

        return result;
    }
    private Scenario getFailedResult(Long id){
        return new Scenario(id,"Update","event updated was unsuccessfully",false);
    }
    private Scenario getPassedResult(Long id){
        return new Scenario(id,"Update","event updated successfully",true);
    }
}
