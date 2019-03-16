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
								(sDate.equals("03/16/2019")|| sDate.equals("02/29/2020")) 
								&& (eDate.equals("03/17/2019")|| eDate.equals("02/29/2020")) 
								&& ID.equals("123")) {
							writer.write("Service Returns :  { id : "+ID+
									" requestType : Update response : event updated successfully success : true }\n");
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
