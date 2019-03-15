package com.tasnia;

import java.util.ArrayList;

public class TestData {
	public static ArrayList <String> statuses = new ArrayList <String>() {
		{
			add("PLANNING");
			add("ORDERED");
			add("CANCEL");
			add("!@#$%%^&*(");
		}
	};
	
	public static ArrayList <String> startDate = new ArrayList <String>() {
		{
			add("validdate");
			add("chardate");
			add("pastDate");
			add("leapYearDate");
			add("invalidFormat");
		}
	};
		
	public static ArrayList <String> endDate = new ArrayList <String>() {
		{
			add("validdate");
			add("chardate");
			add("pastDate");
			add("leapYearDate");
			add("invalidFormat");
		}
	};
		
	public static ArrayList <String> ids = new ArrayList <String>() {	
		{
			add("valid");
			add("%&##!!");
			add("invalidchar");
		}
	};
}
