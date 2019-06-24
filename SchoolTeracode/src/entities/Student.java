package entities;

import java.util.ArrayList;
import java.util.Collection;

import filters.FLastName;
import filters.IFilter;

public class Student extends SchoolEntity {

	private int dni;
	private String firstName;
	private String lastName;
	private ArrayList<String> subjects;
	
	
	
	public Student(int dni, String firstName, String lastName) {
		super();
		this.dni = dni;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	@Override
	public ArrayList<Student> filterStudents(IFilter filter) {
		 ArrayList<Student> result = new ArrayList<Student>();
		if(filter.match(this)) {
			result.add(this);
		}
		return result;
	}
	
	
	// getters -  setters
	
	
	
	public int getDni() {
		return dni;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}


	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
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

}
