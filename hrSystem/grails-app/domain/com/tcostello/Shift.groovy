package com.tcostello

class Shift {

String timeOfDay
String dayOfWeek
Float numberOfHours
String startingTime


String toString()
{
return "$dayOfWeek"
}


    static constraints = {
timeOfDay nullable:false, blank:false
dayOfWeek nullable:false, blank:false
numberOfHours nullable:false, blank:false
startingTime nullable:false, blank:false
    }
}
