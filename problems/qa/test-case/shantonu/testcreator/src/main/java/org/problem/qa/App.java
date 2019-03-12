package org.problem.qa;

import org.problem.qa.model.Scenario;
import org.problem.qa.model.TestRequest;
import org.problem.qa.service.DataGenerator;
import org.problem.qa.service.Tester;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        List<TestRequest> requests = new ArrayList<>();
        List<Scenario> testScenarios = DataGenerator.getScenarios();

        for(Scenario scenario : testScenarios){
            scenario.setResult(Tester.getResult(scenario.getRequest()));
        }
        writeResultsToFile(testScenarios);
    }
    public static void writeResultsToFile(List<Scenario> testScenarios) throws IOException {

       Path resultFile= Paths.get("./results/testCases_"+System.currentTimeMillis()+"_.txt");
        Files.write(resultFile,"Answer : Tests Created By SHANTONU\n".getBytes());
        for (Scenario scenario : testScenarios){
          //  System.out.println(scenario);
            Files.write(resultFile,scenario.toString().getBytes(), StandardOpenOption.APPEND);
        }
    }
}
