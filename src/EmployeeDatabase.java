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


public class Employee {
	private int id;
	private Name name;
	private Address address;
	private Date hired;
	
	
	public Employee (int id, Name name, Address address, Date hired) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.hired = hired;
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
	
	public Address(String street, String city, String state, String zipCode) {
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
 * Test class for the program.
 */

/*
 * Here is the main class that will have all of the project's logic and major control flow.
 */

public class EmployeeDatabase {

	public static void main(String[] args) {
		System.out.println("works.");

	}

}
