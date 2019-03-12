package org.problem.qa.service;

import org.problem.qa.model.TestRequest;
import org.problem.qa.model.TestResult;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Tester {
    private static final String date_format = "MM/dd/yyyy";


    public static TestResult getResult(TestRequest request) {
        boolean result = false;
        if ("PLANNING".equals(request.getStatus()) ||
                "ORDERED".equals(request.getStatus()) ||
                "CANCEL".equals(request.getStatus())) {

            if (isValidFormat(request.getStartDate())) {
                if (isValidFormat(request.getEndDate())) {
                    if (!isPast(request.getStartDate())) {
                        if (!isPast(request.getEndDate())) {
                            if (getDay(request.getEndDate()) >= getDay(request.getStartDate())) {//this was added after
                                if (isNumeric(request.getId())) {
                                    if (isValid(request.getId())) {
                                        result = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return result ? getPassedResult(request.getId()) : getFailedResult(request.getId());
    }

    private static boolean isValid(String id) {
        return "123456".equals(id);
    }

    private static long getDay(String aDate) {
        //return getDate(aDate).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
        return getDate(aDate).toEpochDay();
    }

    private static boolean isValidFormat(String date) {
        String pat = "{}";
        String[] parts = date.split("/");
        if (parts.length != 3 || parts[0].length() != 2 || parts[1].length() != 2 || parts[2].length() != 4) {
            return false;
        } else if ((Integer.valueOf(parts[0]) <= 12 && Integer.valueOf(parts[0]) > 0) &&
                (Integer.valueOf(parts[1]) > 0 && Integer.valueOf(parts[1]) <= 31)) {
            try {
                LocalDate date2 = LocalDate.parse(date, DateTimeFormatter.ofPattern(date_format));
                if(!date2.isLeapYear()){
                    if(date2.getMonthValue()==2){
                        if(Integer.valueOf(parts[1]) > 28){
                            return false;
                        }
                    }

                }
                return true;
            } catch (DateTimeParseException e) {
                return false;
            }
        } else {
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

    private static LocalDate getDate(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(date_format);
        return LocalDate.parse(date, df);
    }

    private static boolean isPast(String date) {

        return getDate(date).toEpochDay() < LocalDate.now().toEpochDay();
    }

    /*public static void main(String[] args) {
        System.out.println(getDate("02/29/2019").toEpochDay());
        System.out.println(LocalDate.now().toEpochDay());
        System.out.println(isPast("02/28/2019"));
    }*/
}
