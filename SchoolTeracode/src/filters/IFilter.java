package filters;


import entities.Student;

public interface IFilter {

	public boolean match(Student s);
}
