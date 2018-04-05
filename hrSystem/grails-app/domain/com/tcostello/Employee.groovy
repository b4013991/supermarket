package com.tcostello

class Employee {

String fullName
Date dateOfBirth
String residence
Float hourlyRate
String employeeID
Date dateEmployed
String taxCode
String contract
Shift shift
Teamleader teamleader
Manager manager

String toString()
{
return "$fullName"
}



    static constraints = {
fullName nullable:false, blank:false
dateOfBirth nullable:false, blank:false
residence nullable:false, blank:false
hourlyRate nullable:false, blank:false
employeeID nullable:false, blank:false, unique:true
dateEmployed nullable:false, blank:false
taxCode nullable:false, blank:false
contract nullable:false, blank:false
    }
}
