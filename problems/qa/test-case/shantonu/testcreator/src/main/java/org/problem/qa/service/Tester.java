package org.problem.qa.service;

import org.problem.qa.model.TestRequest;
import org.problem.qa.model.TestResult;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;

public class Tester {
    private static final String date_format="MM/dd/yyyy";
    public static TestResult getResult(TestRequest request) {
        if ("PLANNING".equals(request.getStatus()) || "ORDERED".equals(request.getStatus()) || "CANCEL".equals(request.getStatus())) {

            if(!isValidFormat(request.getStartDate()) || !isValidFormat(request.getStartDate())){
                return getFailedResult(request.getId());
            }
            else if (isPast(request.getStartDate()) || isPast(request.getEndDate()) ) {
                return getFailedResult(request.getId());
            } else if (getInMili(request.getEndDate()) < getInMili(request.getStartDate())) {
                return getFailedResult(request.getId());
            } else {
                if (isNumeric(request.getId())&& isValid(request.getId())) {
                    return getPassedResult(request.getId());
                } else {
                    return getFailedResult(request.getId());
                }
            }
        } else {
            return getFailedResult(request.getId());
        }
    }

    private static boolean isValid(String id) {
        return "123456".equals(id);
    }

    private static long getInMili(String aDate) {
        return getDate(aDate).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    private static boolean isValidFormat(String date) {
        System.out.println(date);
        String pat = "{}";
        String[] parts = date.split("/");
        System.out.println(Integer.valueOf(parts[0]));
        if(parts.length!=3 || parts[0].length()!=2||parts[1].length()!=2||parts[2].length()!=4){
           return false;
        }

        else if((Integer.valueOf(parts[0])<=12&&Integer.valueOf(parts[0])>0)&&
                (Integer.valueOf(parts[1])>0 &&Integer.valueOf(parts[1])<=31)){
            try{
                LocalDate date2 = LocalDate.parse(date,DateTimeFormatter.ofPattern(date_format));
                return true;
            }
           catch (DateTimeParseException e){
                return false;
           }
        }
        else {
            return false;
        }
    }

    private static TestResult getFailedResult(String id) {
        return new TestResult(id, "Update", "event updated was unsuccessfully", false);
    }

    private static TestResult getPassedResult(String id) {
        return new TestResult(id, "Update", "event updated successfully", true);
    }

    private static boolean isNumeric(String stringID) {
        try {
            Long val = Long.parseLong(stringID);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static LocalDate getDate(String date){
        DateTimeFormatter df = DateTimeFormatter.ofPattern(date_format);
        return  LocalDate.parse(date,df);
    }

    private static boolean isPast(String date) {

        return getDate(date).toEpochDay()>=LocalDate.now().toEpochDay();
    }
}
