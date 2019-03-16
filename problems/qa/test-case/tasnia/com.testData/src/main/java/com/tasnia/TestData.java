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
			add("03/16/2019");
			add("as*&20");
			add("02/16/2019");
			add("02/29/2004");
			add("2004/21/01");
		}
	};
		
	public static ArrayList <String> endDate = new ArrayList <String>() {
		{
			add("03/17/2019");
			add("as*&20");
			add("02/16/2019");
			add("02/29/2004");
			add("2004/21/01");
		}
	};
		
	public static ArrayList <String> ids = new ArrayList <String>() {	
		{
			add("123");
			add("%&##!!");
			add("invalidChar");
		}
	};
}
