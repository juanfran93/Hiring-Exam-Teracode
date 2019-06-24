package filters;

import entities.SchoolEntity;
import entities.Student;

public class FLastName implements IFilter{

	private String letter;
	
	
	
	public FLastName(String letter) {
		super();
		this.letter = letter;
	}



	public boolean match(Student s) {

		return s.getLastName().startsWith(letter);
	}

	
}
