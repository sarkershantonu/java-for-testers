package org.problem.qa.service;

import org.problem.qa.model.Scenario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriter {
    public static void writeResultsToFile(List<Scenario> testScenarios) throws IOException {

        Path resultFile= Paths.get("./results/testCases_"+System.currentTimeMillis()+"_.txt");
        Files.write(resultFile,"Answer : Tests Created By SHANTONU\n".getBytes());
        for (Scenario scenario : testScenarios){
            //  System.out.println(scenario);
            Files.write(resultFile,scenario.toString().getBytes(), StandardOpenOption.APPEND);
        }
    }
}
