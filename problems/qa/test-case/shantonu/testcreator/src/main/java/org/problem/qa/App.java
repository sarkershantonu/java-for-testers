package org.problem.qa;

import org.problem.qa.model.Scenario;
import org.problem.qa.model.TestRequest;
import org.problem.qa.service.DataGenerator;
import org.problem.qa.service.Tester;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<TestRequest> requests = new ArrayList<>();
        List<Scenario> testScenarios = DataGenerator.getScenarios();

        for(Scenario scenario : testScenarios){
            scenario.setResult(Tester.getResult(scenario.getRequest()));
        }

        writeResultsToFile(testScenarios);
    }
    public static void writeResultsToFile(List<Scenario> testScenarios){

        for (Scenario scenario : testScenarios){
            System.out.println(scenario);
        }
    }
}
