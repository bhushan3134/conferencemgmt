http://localhost:8080/h2-console/
------------------------------------------------
Driver Class: org.h2.Driver

JDBC URL: jdbc:h2:mem:testdb

User Name: Sa

password:<BLANK>

Demo Steps
---------------------
1. Get Talk Populated at start up
    
    GET http://localhost:8080/conference/talk/1

    {"talkId":1,"title":"Java8","topic":"Lambda","roomNo":10,"attendees":[]}

2. Get Attendee Populated at start up

    http://localhost:8080/conference/attendee/1
    
    {"attendeeId":1,"name":"Bhushan Mandlik","company":"Oracle","email":"bhushan@oracle.com"}

3. Register Attendee for Talk
    
    POST: http://localhost:8080/conference/talk/1/attendee/1

4. Get Talk - Attandee is Registered
    
    http://localhost:8080/conference/talk/1
    
    {"talkId":1,"title":"Java8","topic":"Lambda","roomNo":10,"attendees":[{"attendeeId":1,"name":"Bhushan Mandlik","company":"Oracle","email":"bhushan@oracle.com"}]}

5. Add New Attendee
    
    http://localhost:8080/conference/attendee

    POST Method:
    
    Header: Content-Type : application/json

    Raw Body: {"name":"Rahul D","company":"IBM","email":"RD@ibm.com"}

6. Register New Attendee to Talk

    POST: http://localhost:8080/conference/talk/1/attendee/2

7. Get Talk - New Attendee is also Registered to talk
    
    http://localhost:8080/conference/talk/1
    
    {"talkId":1,"title":"Java8","topic":"Lambda","roomNo":10,"attendees":[{"attendeeId":1,"name":"Bhushan Mandlik","company":"Oracle","email":"bhushan@oracle.com"},{"attendeeId":2,"name":"Rahul D","company":"IBM","email":"RD@ibm.com"}]}

8. Add new Talk
    
    http://localhost:8080/conference/talk
    
    POST Method:
    
    Header: Content-Type : application/json
    
    Raw Body: {"title":"Spring","topic":"Spring Boot","roomNo":20}

9. Get New Talk
    
    http://localhost:8080/conference/talk/2
    
    {"talkId":2,"title":"Spring","topic":"Spring Boot","roomNo":20}
