package org.automation;

import org.automation.suits.RegressionTestsSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RunTests {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Class<?>[] testClasses = getClasses(loadClasses());

        JUnitCore junit = new JUnitCore();
        Result testResult = junit.run(RegressionTestsSuite.class);

     /*   for (Class<?> s : testClasses) {
            System.out.println(s.getCanonicalName());
        }*/
    }

    private static List<String> loadClasses() throws IOException {
        final String pathOfClassFile = "./test-classes.txt";
        Path path = Paths.get(pathOfClassFile);
        return Files.readAllLines(path);
    }
    //todo - parsing test classes from testing maven folders
    protected static Class<?>[] getClasses(List<String> items) throws ClassNotFoundException {
        final String package_name = "org.automation.tests.";
        ArrayList<Class<?>> classes = new ArrayList<>();
        for (String s : items) {
            System.out.println(s);
            classes.add(Class.forName(package_name + s+".class"));
        }
        return (Class<?>[]) classes.toArray();
    }
}
