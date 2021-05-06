import java.util.ArrayList;

public class Course {

	// instance variables
	private String code; // no need for a name at this point, just the course code
	
	// list of students enrolled in the course
	private ArrayList<Student> students = new ArrayList<Student>();
	
	// grades for the course, if any
	private ArrayList<Grade> grades = new ArrayList<Grade>();

	// constructor. just initialize with course code and add students and grades after
	public Course(String code) {
		this.code = code;
	}

	// getters and setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Grade> getGrades() {
		return grades;
	}
	
	
	
	
	// need to be able to look up Courses by course code eg "SWEN501"
	
	// When looking at a course, the user should be able to see:
	// How many students are in the course
	// All students currently enrolled in the course
	// The grades given to all students who have completed the course
}
