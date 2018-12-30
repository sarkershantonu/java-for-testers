package org.automation.core;

import org.automation.app.Calculator;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class TestBase {
    protected static Calculator aCalculator;
    protected static int THREAD = 1;
    protected static int TIMEOUT_MS = 1;
    protected static double DELTA = 0.001;

    @BeforeClass
    public static void commonSteps() throws IOException {
        loadProperties();
        initConstants();
        aCalculator = new Calculator();
    }

    public static void loadProperties() throws IOException {
        load("./properties/test.properties");
    }

    private static void initConstants() {
        THREAD = Integer.valueOf(System.getProperty("junit.run.thread")).intValue();
        TIMEOUT_MS = Integer.valueOf(System.getProperty("junit.timeout.default")).intValue() * 1000;
        DELTA = Double.valueOf(System.getProperty("junit.double.delta"));
    }

    private static void load(String path) throws IOException {
        Properties properties = new Properties();
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
        // System.setProperties(properties);

        // another approach
        for (String key : properties.stringPropertyNames()) {
            System.setProperty(key, properties.getProperty(key));
        }
    }
}
