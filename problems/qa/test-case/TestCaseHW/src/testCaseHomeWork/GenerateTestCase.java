package testCaseHomeWork;

import java.util.ArrayList;

public class GenerateTestCase {

    private static ArrayList<ArrayList<String>> list = new ArrayList<>();
    private static int totalTestCase = 0;
    public static void main(String [] args){

        ArrayList<String> statusTestCase = new ArrayList<>();
        statusTestCase.add("ValidStatus");
        statusTestCase.add("InvalidStatus");
        list.add(statusTestCase);

        ArrayList<String> passTestCase = new ArrayList<>();
        passTestCase.add("ValidPass");
        passTestCase.add("InvalidPass");
        list.add(passTestCase);

        ArrayList<String> startDateTestCase = new ArrayList<>();
        startDateTestCase.add("ValidStartDate");
        startDateTestCase.add("PASTStartDate");
        startDateTestCase.add("leapyearStartDate");
        startDateTestCase.add("FormatfutureStartDate");
        startDateTestCase.add("invalidCharacterStartDate");
        list.add(startDateTestCase);

        ArrayList<String> endDateTestCase = new ArrayList<>();
        endDateTestCase.add("ValidEndDate");
        endDateTestCase.add("PASTEndDate");
        endDateTestCase.add("leapyearEndDate");
        endDateTestCase.add("FormatfutureEndDate");
        endDateTestCase.add("invalidCharacterEndDate");
        list.add(endDateTestCase);

        ArrayList<String> idTestCase = new ArrayList<>();
        idTestCase.add("ValidID");
        idTestCase.add("InvalidID");
        idTestCase.add("InvalidCharID");
        list.add(idTestCase);


        printList(0,new ArrayList<String>());
        System.out.println("Total Test Case Is: " + totalTestCase);
    }

    public static void  printList(int nowArray,ArrayList<String>print){
        if (nowArray == list.size()){
            System.out.println(print);
            print.clear();
            ++totalTestCase;
            return;
        }

        for(int i=0; i<list.get(nowArray).size();i++){
            ArrayList<String> temp = (ArrayList<String>) print.clone();
            temp.add(list.get(nowArray).get(i));
            printList(nowArray+1, temp);
            temp = null;
        }



    }
}
