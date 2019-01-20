package org.automation.utils;

import java.util.List;

public class TestRunnerUtils {
    public static Class<?> getClassFromString(final String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return Class.forName(name);
    }

    public static Class<?>[] getArrayOfClass(List<Class<?>> listOfClasses){
        Class<?>[] classArray = new Class[listOfClasses.size()];
        int i = 0;
        for (Class<?> b : listOfClasses) {
        //    System.out.println(b);
            classArray[i++] = b;
        }
        return classArray;
    }
}
