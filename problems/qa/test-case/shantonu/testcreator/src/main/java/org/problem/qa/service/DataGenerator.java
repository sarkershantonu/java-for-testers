package org.problem.qa.service;

import org.problem.qa.model.Scenario;
import org.problem.qa.model.TestRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    private static List<String> startDates = Arrays.asList("03/01/2019","03/25/2019","02/29/2020","25/03/2019","SHANTONU");
    private static List<String> endDates = Arrays.asList("03/01/2019","03/25/2019","02/29/2020","25/03/2019","SHANTONU");;
    private static List<String> statuses = Arrays.asList("PLANNING","ORDERED","CANCEL","!@#$%%^&*(");
    private static List<String> ids = Arrays.asList("123456","SKS","564789");

    public static List<Scenario> getScenarios(){
        List<Scenario> scenarioList = new ArrayList<>();
        long i= 0;
        for (String status : statuses){
            for (String start : startDates){
                for (String end : endDates){
                    for (String  id : ids){
                            scenarioList.add(new Scenario(i," TC : "+i,new TestRequest(start,end,status,id),null));
                    }
                }
            }
        }
        return scenarioList;
    }
}
