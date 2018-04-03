package com.tcostello

class Task {

String taskName
int numberOfPeople
String sectionName
String department
String timeRequired
String description
Boolean taskCompleted

    static constraints = {
taskName nullable:false, blank:false
numberOfPeople nullable:false, blank:false
sectionName nullable:false, blank:false
department nullable:false, blank:false
timeRequired nullable:false, blank:false
description nullable:false, blank:false
taskCompleted nullable:false, blank:false
    }
}
