import java.util.ArrayList;
import java.util.HashMap;

public class Grade {

	// grades belong to a student and a course
	private Student student;
	private Course course;
	
//	// static field to hold all grades and allow for querying whether a grade exists
//	private static ArrayList<Grade> grades = new ArrayList<Grade>();
	
	// ^ nope. we're using mappings now! we're big bois
	private static Map<Student, Grade> studentGrades = new HashMap<>();
	private static Map<Course, Grade> courseGrades = new HashMap<>();

	// constructor
	public Grade(Student student, Course course) {
		this.student = student;
		this.course = course;
	}

	// return whether a student has a grade or not (has completed a course or not) for a specified course
	public boolean hasGrade(Student s, Course c) {
		
		// loop through grades? no no no no no
		// we need mappings.
	}
	
	// getters and setters
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
