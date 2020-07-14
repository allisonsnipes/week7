/*
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Assignment 7 Question 1
 * 
 *  Project Specs:
 *  This assignment will use the Employee class that you developed for assignment 6. Design two sub- classes of 
 *  Employee...SalariedEmployee and HourlyEmployee. A salaried employee has an annual salary attribute. An 
 *  hourly employee has an hourly pay rate attribute, an hours worked attribute, and an earnings attribute. An
 *  hourly employee that works more than 40 hours gets paid at 1.5 times their hourly pay rate. You will decide 
 *  how to implement constructors, getters, setters, and any other methods that might be necessary.
 *  
 *  Project Deliverables:
 *  1. Implement the classes, and write a test program that creates:
 *  			One salaried employee
 *  			One of the hourly employees should have hours worked set to less than 40.
 *  			One should have hours worked set to more than 40. 
 *  2. The test program should display all attributes for the three employees. 
 *  			To keep things simple, the employee classes don’t need to do any editing.
 */

/*
 * Here I will set up my old employees' classes to use the project. However I will also need to use
 * the old classes since the employee class depends on those
 */

class Employee {
	private int id;
	private Name name;
	private Address address;
	private int date;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public Employee (int id, Name name, Address address, int date) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
	}

	public void showInfo() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Hired On: " + date);
	}
}

// old name class
class Name {
	private String firstName, lastName;
	
	public String getFirst() {
		return firstName;
	}
	
	public void setFirst(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public void setLast(String lastName) {
		this.lastName = lastName;
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}	
}

// old address class
class Address {
	private String street, city, state, zipCode;
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.street = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Address(String street) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String toString() {
		return street + " " + city + " " + state + " " + zipCode;
	}
}

// old date class
class Date {
	private int day, month, year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getyear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return day + " " + month + " " + year;
	}
}

/*
 * Test class for the program, also will have the main class that will have all of the project's logic and major control flow.
 */

public class EmployeeDatabase {

	public static void main(String[] args) {
		headerMsg();
		
		// format: HourlyEmp(double earned, double hourlySalary, double workedHr, int id, Name name, Address address, Date hired)
		System.out.println("\n+--- Hourly Employee 1: Works Less Than 40hrs ---+\n");
		HourlyEmp emp1 = new HourlyEmp(0, 90, 39, 0, null, null, 0);
		emp1.setId(001);
		emp1.setName(new Name("Jon", "Dear"));
		emp1.setAddress(new Address("123 Seseme St, San Francisco, CA, 94320"));
		emp1.setDate(3211990);
		
		System.out.println("id: " + emp1.getId());
		System.out.println("Name: " + emp1.getName());
		System.out.println("Address: " + emp1.getAddress());
		System.out.println("Hired: " + emp1.getDate());
		System.out.println("Salary: " + emp1.getEarned());
		
		//format: HourlyEmp(double earned, double hourlySalary, double workedHr, int id, Name name, Address address, Date hired)
		System.out.println("\n+--- Hourly Employee 2: Works More Than 40hrs---+\n");
		HourlyEmp emp2 = new HourlyEmp(0, 67, 80, 0, null, null, 0);
		emp2.setId(002);
		emp2.setName(new Name("Yasmin", "Simone"));
		emp2.setAddress(new Address("500 Battery St, SanFrancisco, 94111"));
		emp2.setDate(4022009);
		
		System.out.println("id: " + emp2.getId());
		System.out.println("Name: " + emp2.getName());
		System.out.println("Address: " + emp2.getAddress());
		System.out.println("Hired: " + emp2.getDate());
		System.out.println("Salary: " + emp2.getEarned());
		
		
		
		System.out.println("\n+--- Salaried Employee ---+\n");
		// format: double yearlySalary, int id, Name name, Address address, int date
		SalariedEmp emp3 = new SalariedEmp(90000, 0, null, null, 0);
		emp3.setId(003);
		emp3.setName(new Name("Georgie", "Santana"));
		emp3.setAddress(new Address("\n237 Lombard St, SanFrancisco, CA 94111\n"));
		emp3.setDate(7042014);
		
		System.out.println("id: " + emp3.getId());
		System.out.println("Name: " + emp3.getName());
		System.out.println("Address: " + emp3.getAddress());
		System.out.println("Hired: " + emp3.getDate());
		System.out.println("Salary: " + emp3.getYearlySalary());

	}
	
	public static void headerMsg() {
		System.out.println("\n");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                                   Welcome User,                              |");
		System.out.println("|          This application will display the salary information of a few       |");
		System.out.println("|    employee's in a ficticious company. Please press enter to start the app.  |");
		System.out.println("|                                   Let's start!                               |");
		System.out.println("+------------------------------------------------------------------------------+");
	}

}
