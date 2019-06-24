package entities;

import java.util.ArrayList;

import filters.IFilter;

public abstract class SchoolEntity{
	
	public abstract ArrayList<Student> filterStudents(IFilter filter);
	

}
