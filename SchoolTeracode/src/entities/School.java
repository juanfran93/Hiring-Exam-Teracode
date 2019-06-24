package entities;

import java.util.ArrayList;
import java.util.Hashtable;

import filters.FLastName;
import filters.FSubject;
import filters.IFilter;

public class School extends SchoolEntity {

	private String name;
	private ArrayList<String> subjects = new ArrayList<String>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	
	public School(String name) {
		super();
		this.name = name;
	}
	
	
	// (A) <------
	public Hashtable<Character, ArrayList<Student>> getStudentsGroupedbyLastName(){
		Hashtable<Character,ArrayList<Student>> result = new Hashtable<>();
		
		for(char letter = 'A'; letter < 'Z'; letter++) {
			ArrayList<Student>  students = this.filterStudents(new FLastName(Character.toString(letter)));
			if(!students.isEmpty()) {
				result.put(letter,students);
			}
		}
		
		return result;
	}
	
	// (B) <------
	public ArrayList<Student> getStudentsInASubject(String subject){
		return this.filterStudents(new FSubject(subject));
	}
	
	
	@Override
	public ArrayList<Student> filterStudents(IFilter filter) {
		ArrayList<Student> result = new ArrayList<>();
		for(Student s : students) {
			result.addAll(s.filterStudents(filter));
		}
		return result;
	}
	

	// getters -  setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}


	
	
	
}
