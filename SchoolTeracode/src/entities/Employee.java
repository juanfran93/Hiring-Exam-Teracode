package entities;

import java.util.ArrayList;

import filters.IFilter;

public class Employee extends SchoolEntity {

	private int dni;
	private String firstName;
	private String lastName;
	
	private String ocupation; //can be changed to Enum class
	
	private double salary;

	public Employee(int dni, String firstName, String lastName, String ocupattion, double salary) {
		super();
		this.dni = dni;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ocupation = ocupation;
		this.salary = salary;
	}
	
	
	
	@Override
	public ArrayList<Student> filterStudents(IFilter filter) {
		// TODO Auto-generated method stub
		return new ArrayList<Student>();
	}
	
	

	// getters -  setters
	

	public int getDni() {
		return dni;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOcupattion() {
		return ocupation;
	}

	public void setOcupattion(String ocupation) {
		this.ocupation = ocupation;
	}


	
	
}
