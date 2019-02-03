# Problem : Test Case : 
- How many test cases can be possible. 

# Statement : 
We have an event/plan management software 

In UPDATE GUI there are 3 selections 
- STATUS drpdown > Contains "PLANNING","ORDERED","CANCEL"
- Start Date > A calender date picker 
- END Date > A calender date picker 

You need to find 
1. How many test cases can be created? 
2. Define those test cases 
3. Which will be success and which will be failed

In testing, there can be success/fail request based on data

Conditions (fail/success): 
1. event can't be restarted if it was cancelled. 
2. Start/End date can't be updated with past dates.

User can select in UI or send in API request : 

# Sample API call 

{ "status": "ORDERED", "startDate": "01/16/2019", "endDate" : "03/17/2019", "id": "106094" }
 
# Sample Response 

{
"id": "106094",
"requestType": "Update",
"response": "event updated successfully",
"success": true
}
