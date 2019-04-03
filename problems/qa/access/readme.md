in DB there are 10 users & there are 4 type of roles

Admin = Have all access = return message "you are an admin"
rwc=read, write, cancel  = return message " you can read, write & cancel"
rw = read & wrote= return message " you can read, write but can not cancel"
ro=read only= return message " you can read only"

Rules : 
1. If an user dont have any role, return message " Un Authorized)
2. If an user has Multiple Role , Heigher role will replace lower role permissions

Sample Input : 
{
"username" :"Shantonu"
}

Sample Output : 
{
"auth": "you are an admin"
}

in DB these are following users : 
Admin = shantonu, rony, sajib
rwc= arafat, tanvir
rw=rahin, manun
ro=tasnia, tushar, sharmin


TASK: 
1. list all possible requests and its responses. 
2. How many type of scenarios will be present including all possible validations. Only count 1 test case from each type of validations. 
3. Build a test generator tool
