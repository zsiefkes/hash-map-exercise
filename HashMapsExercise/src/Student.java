import java.util.ArrayList;

public class Student {
	
	// static student id list
	private static ArrayList<Integer> idList = new ArrayList<>();

	// instance variables
	private String name;
	private int id;
	
	// field for storing courses student is taking
	private ArrayList<Course> courses = new ArrayList<Course>();

	// constructor
	public Student(String name) {
		this.name = name;
		// set unique id between 1000000 and 4000000 using size of idList
		this.id = idList.size() + 1000001; // just assuming we're not going to have > 3000000 students here.
	}
	
	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ArrayList<Integer> getIdList() {
		return idList;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
	

	// need to be able to look up a student by student ID number between 1000000 and 4000000
	
	// When looking at a student, the user should be able to see:
	// The grades the student received in all courses they have completed
	// A list of all courses the student is currently enrolled in (including those which do not yet have grades) */
	
	// get details. nah found myself trying to format nicely - this should live on the user interface 
//	public String getDetails() {
//		
//		// string to return
//		String details = this.getName();
//		
//		// list courses student is enrolled in
//		
//		// list grades from all courses. if a student has a grade assigned for a course, they are no longer enrolled in that course.
//		
//		return details;
//	}
	
	
}
