package com.tasnia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestDataCreator extends TestData{
	public static void main(String[] args) {
		 try {
			 FileWriter writer = new FileWriter("MyFile.txt", true);
        
		for(String status: statuses) {
			for(String sDate : startDate) {
				for(String eDate : endDate) {
					for(String ID : ids) {
						writer.write("API Call : {status : "+ status+" startDate : "+ 
								sDate+" endDate : "+eDate+" id : "+ID+" }\n");
						if((status.equals("PLANNING")|| status.equals("ORDERED"))&&
								(sDate.equals("validdate")|| sDate.equals("leapYearDate")) 
								&& (eDate.equals("validdate")|| eDate.equals("leapYearDate"))
								&& ID.equals("valid")) {
							writer.write("Service Returns :  { id : "+ID+
									" requestType : Update response : event updated successfully success : u001B31;true }\n");
						}
						else {
							writer.write("Service Returns :  { id : "+ID+
									" requestType : Update response : event updated Unsuccessful success : false }\n");
						}
					}
				}
			}
		}
		 }
		 catch (IOException e) {
	            e.printStackTrace();
		 }
		
	}
}
