package filters;

import entities.Student;


public class  FSubject implements IFilter {
	
	private String subject;

	public FSubject(String subject) {
		super();
		this.subject = subject;
	}

	public boolean match(Student s) {
		return s.getSubjects().contains(subject);
	}
	
	

}
