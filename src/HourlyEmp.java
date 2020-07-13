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
 * Here is the sub class for hourly Employee that worked more than 40hours and for those who
 * work their normal 40hrs or less work week. I will need to code it as the same subclass
 * but use an if else statement to account for OT hours.
 */

public class HourlyEmp extends Employee {
	private double earned, hourlySalary, workedHr;
	
	public double getEarned() {
		if (workedHr <= 40) {
			earned = (hourlySalary * workedHr);
		} else {
			earned = (40 * hourlySalary) + ((hourlySalary * 1.5) * ((workedHr - 40)));
		}
		return earned;
	}
	
	public void setEarned(double earned) {
		this.earned = earned;
	}
	
	public double getHourlySalary() {
		return hourlySalary;
	}
	
	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	public double getWorkedHr() {
		return workedHr;
	}
	
	public void setWorkedHr(double workedHr) {
		this.workedHr = workedHr;
	}
	
	public HourlyEmp(double earned, double hourlySalary, double workedHr, int id, Name name, Address address, Date hired) {
		super(id, name, address, hired);
		this.earned = earned;
		this.hourlySalary = hourlySalary;
		this.workedHr = workedHr;
	}
	
	public String toString() {
		return " $" + earned + " $" + hourlySalary + " " + workedHr;
	}

}
