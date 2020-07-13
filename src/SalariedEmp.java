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
 * Here I will set up the subclass for a salaried employee which extends from the employee class.
 */

public class SalariedEmp extends Employee{
	
	private double yearlySalary;
	
	public double getYearlySalary() {
		return yearlySalary;
	}
	
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	public SalariedEmp(double yearlySalary, int id, Name name, Address address, Date hired) {
		super(id, name, address, hired);
		this.yearlySalary = yearlySalary;
	}
	
	public String toString() {
		return " $" + yearlySalary + " ";
	}

}
