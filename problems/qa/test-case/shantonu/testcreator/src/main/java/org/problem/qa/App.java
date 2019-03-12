package org.problem.qa;

import org.problem.qa.model.Scenario;
import org.problem.qa.model.TestRequest;
import org.problem.qa.service.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        List<TestRequest> requests = new ArrayList<>();
        List<Scenario> testScenarios = DataGenerator.getScenarios();

        for(Scenario scenario : testScenarios){
            scenario.setResult(Tester.getResult(scenario.getRequest()));
        }
        FileWriter.writeResultsToFile(testScenarios);
    }
}
