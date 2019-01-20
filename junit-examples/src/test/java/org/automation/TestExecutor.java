package org.automation;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.automation.utils.TestRunnerUtils.*;

public class TestExecutor {

    public static void main(String[] args){
      //  runJunitTests(RegressionTestsSuite.class);
       // runJunitTestFromFile("./tests/test-classes.txt");
        runJunitTestFromFile(args[0]);
    }


    public static void runJunitTests(final Class<?>... testClasses) {
        Result testResult = JUnitCore.runClasses(testClasses);
        for (Failure aFail : testResult.getFailures()) {
            System.out.println(aFail.getMessage());
            aFail.getException().printStackTrace();
        }
    }

    public static void runJunitTestFromFile(final String file_path){
        Path path = Paths.get(file_path);
        List<String> classNames = null;
        try {
            classNames = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Class<?>> classes = new ArrayList<>();
        for (String a : classNames) {
           // System.out.println(a);
            try {
                classes.add(getClassFromString(a));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        runJunitTests(getArrayOfClass(classes));
    }
}
