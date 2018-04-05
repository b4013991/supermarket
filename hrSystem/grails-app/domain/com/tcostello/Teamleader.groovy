package com.tcostello

class Teamleader {

String fullName
String department
String employeeID
String sectionName
int officePhone
String leaderEmail
String password
Manager manager
Team team


    static constraints = {
fullName nullable:false, blank:false
department nullable:false, blank:false
employeeID nullable:false, blank:false, unique:true
sectionName nullable:false, blank:false
officePhone nullable:false, blank:false
leaderEmail nullable:false, blank:false
password nullable:false, blank:false
    }
}
