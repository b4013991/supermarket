package hrsystem

class BootStrap {

    def init = { servletContext ->

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
department: 'Grocery').save(failOnError:true)

def man2 = new com.tcostello.Manager(
fullName: 'Chad Daboss',
userName: 'cboss',
password: 'cboss97',
managerEmail: 'cboss@gmail.com',
office: 'B2-500',
department: 'Electronics').save(failOnError:true)

def man3 = new com.tcostello.Manager(
fullName: 'Chris Pierre',
userName: 'cpierre',
password: 'password1',
managerEmail: 'cpierre@gmail.com',
office: 'B4-900',
department: 'Clothing').save(failOnError:true)

//Team Leader

def lead1 = new com.tcostello.Teamleader(
fullName: 'Sarah Macdonald',
department: 'Clothing',
employeeID: 'TL1111',
sectionName: 'Checkout',
officePhone: '0192347857',
leaderEmail: 'smac@gmail.com',
password: 'dff4h').save(failOnError:true)

def lead2 = new com.tcostello.Teamleader(
fullName: 'Frank Ocean',
department: 'Grocery',
employeeID: 'TL1123',
sectionName: 'Fishery',
officePhone: '019347632',
leaderEmail: 'focean@gmail.com',
password: 'nikes').save(failOnError:true)

def lead3 = new com.tcostello.Teamleader(
fullName: 'Tom Costello',
department: 'Grocery',
employeeID: 'TL2244',
sectionName: 'Alcohol',
officePhone: '018475940',
leaderEmail: 'worktomcostello@gmail.com',
password: 'pass123').save(failOnError:true)

//Employee

def emp1 = new com.tcostello.Employee(
fullName: 'Tom Rivers',
dateOfBirth: new Date('05/05/1999'),
residence: 'Sheffield',
hourlyRate: '7.50',
employeeID: 'E2555',
dateEmployed: new Date('26/02/2018'),
taxCode: 'TX345',
contract: 'Full-time').save(failOnError:true)

    }
    def destroy = {
    }
}
