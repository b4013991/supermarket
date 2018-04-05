package hrsystem

class BootStrap {

    def init = { servletContext ->
/*
//Team

def team1 = new com.tcostello.Team(
	teamName: 'Loading',
	numberOfEmployees: '10',
	sectionName: 'Fishery',
	description: 'Loading and unloading deliveries').save(failOnError:true)

def team2 = new com.tcostello.Team(
	teamName: 'Cleaning',
	numberOfEmployees: '20',
	sectionName: 'Alcohol',
	description: 'Cleaning up spillages').save(failOnError:true)

def team3 = new com.tcostello.Team(
	teamName: 'Serving',
	numberOfEmployees: '10',
	sectionName: 'Checkout',
	description: 'Serving and checking out customers').save(failOnError:true)

//Manager

def man1 = new com.tcostello.Manager(
	fullName: 'Steve Crossbar',
	userName: 'scross',
	password: 'scross98',
	managerEmail: 'scross@gmail.com',
	office: 'B1-900',
	department: 'Grocery',
	team: team2).save(failOnError:true)

def man2 = new com.tcostello.Manager(
	fullName: 'Chad Daboss',
	userName: 'cboss',
	password: 'cboss97',
	managerEmail: 'cboss@gmail.com',
	office: 'B2-500',
	department: 'Electronics',
	team: team1).save(failOnError:true)

def man3 = new com.tcostello.Manager(
	fullName: 'Chris Pierre',
	userName: 'cpierre',
	password: 'password1',
	managerEmail: 'cpierre@gmail.com',
	office: 'B4-900',
	department: 'Clothing',
	team: team3).save(failOnError:true)

//Team Leader

def lead1 = new com.tcostello.Teamleader(
	fullName: 'Sarah Macdonald',
	department: 'Clothing',
	employeeID: 'TL1111',
	sectionName: 'Checkout',
	officePhone: '0192347857',
	leaderEmail: 'smac@gmail.com',
	password: 'dff4h',
	manager: man1,
	team: team2).save(failOnError:true)

def lead2 = new com.tcostello.Teamleader(
	fullName: 'Frank Ocean',
	department: 'Grocery',
	employeeID: 'TL1123',
	sectionName: 'Fishery',
	officePhone: '019347632',
	leaderEmail: 'focean@gmail.com',
	password: 'nikes',
	manager: man2,
	team: team1).save(failOnError:true)

def lead3 = new com.tcostello.Teamleader(
	fullName: 'Tom Costello',
	department: 'Grocery',
	employeeID: 'TL2244',
	sectionName: 'Alcohol',
	officePhone: '018475940',
	leaderEmail: 'worktomcostello@gmail.com',
	password: 'pass123',
	manager: man3,
	team: team3).save(failOnError:true)


//Task

def task1 = new com.tcostello.Task(
	taskName: 'Restocking',
	numberOfPeople: '2',
	sectionName: 'Alcohol',
	department: 'Grocery',
	timeRequired: '2 hours',
	description: 'Restocking shelves',
	taskCompleted: 'false').save(failOnError:true)

def task2 = new com.tcostello.Task(
	taskName: 'Counting',
	numberOfPeople: '2',
	sectionName: 'Checkout',
	department: 'Financial',
	timeRequired: '1 hour',
	description: 'Counting money from tills',
	taskCompleted: 'true').save(failOnError:true)

def task3 = new com.tcostello.Task(
	taskName: 'Baking',
	numberOfPeople: '2',
	sectionName: 'Bakery',
	department: 'Grocery',
	timeRequired: '4 hours',
	description: 'Baking fresh goods',
	taskCompleted: 'false').save(failOnError:true)

//Shift

def shift1 = new com.tcostello.Shift(
	timeOfDay: 'Morning',
	dayOfWeek: 'Monday',
	numberOfHours: '4',
	startingTime: '6:00am').save(failOnError:true)

def shift2 = new com.tcostello.Shift(
	timeOfDay: 'Afternoon',
	dayOfWeek: 'Tuesday',
	numberOfHours: '6',
	startingTime: '12:00am').save(failOnError:true)

def shift3 = new com.tcostello.Shift(
	timeOfDay: 'Evening',
	dayOfWeek: 'Wednesday',
	numberOfHours: '8',
	startingTime: '6:00am').save(failOnError:true)

//Employee

def emp1 = new com.tcostello.Employee(
	fullName: 'Tom Rivers',
	dateOfBirth: new Date('05/05/1999'),
	residence: 'Sheffield',
	hourlyRate: '7.50',
	employeeID: 'E2555',
	dateEmployed: new Date('26/02/2018'),
	taxCode: 'TX345',
	contract: 'Part-time',
	shift: shift1,
	teamleader: lead1,
	manager:man1).save(failOnError:true)
	

def emp2 = new com.tcostello.Employee(
	fullName: 'Chloe Bold',
	dateOfBirth: new Date('06/02/1997'),
	residence: 'Chesterfield',
	hourlyRate: '8',
	employeeID: 'E2675',
	dateEmployed: new Date('20/07/2017'),
	taxCode: 'TX234',
	contract: 'Full-time',
	shift: shift2,
	teamleader: lead2,
	manager:man2).save(failOnError:true)

def emp3 = new com.tcostello.Employee(
	fullName: 'Harry Oldfield',
	dateOfBirth: new Date('05/05/1977'),
	residence: 'Rotherham',
	hourlyRate: '9',
	employeeID: 'E5678',
	dateEmployed: new Date('01/02/2014'),
	taxCode: 'TX667',
	contract: 'Full-time',
	shift: shift3,
	teamleader: lead3,
	manager:man3).save(failOnError:true)
	

*/

    }
    def destroy = {
    }
}
