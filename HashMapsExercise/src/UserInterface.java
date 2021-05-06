import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
	
	// scanner to read user input in text-based interface 
	private Scanner input = new Scanner(System.in);
	
	// fields to store students and courses. grades will live on courses and each student
	// do we need these? apparently we don't.
//	private ArrayList<Course> courses = new ArrayList<Course>();
//	private ArrayList<Student> students = new ArrayList<Student>();
	
	// so, we're also going to want some HashMaps!! I guess these should live on the user interface class?
	// initialize map with appropriate object types
//	private Map<String, Student> studentsByName = new HashMap<String, Student>();
	// the way Michael's done it doesn't require you to set the types on the hashmap, weirdly?
	private Map<String, Student> students = new HashMap<>(); // students by name 
	private Map<Integer, Student> studentsById = new HashMap<>(); // students by id
	private Map<String, Course> courses = new HashMap<>(); // courses by course code

	// constructor
	public UserInterface() {
		// initiate interface with message
		System.out.println("Welcome to the university database interface.");
		
		// persistent text interface
		while (true) {
			
			// print question and options
			System.out.println("What would you like to do? Enter p to view options.");
			
			// obtain user input command using scanner
			String command = input.nextLine();
			
			// sort commands
			if ("as".equalsIgnoreCase(command)) {
				addStudent();
			} else if ("fs".equalsIgnoreCase(command)) {
				findStudentByName();
			} else if ("p".equalsIgnoreCase(command)) {
				// print options
				System.out.println("ac: Add course");
				System.out.println("as: Add student");
				System.out.println("fc: Find course by code");
				System.out.println("fs: Find student by name");
				System.out.println("fsi: Find student by ID");
				System.out.println("q: Quit");
			
			} else if ("q".equalsIgnoreCase(command)) {
				// end interface. i was going to go with break. Michael uses return
				return;
			}
			
			
		}
	}

	// add student using text interface. Note use of private keyword - no need for this method to be accessed from elsewhere
	private void addStudent() {
		// ask user to input student name
		System.out.println("Student's name: ");
		
		// scan user input
		String name = input.nextLine();
		
		// create student using name
		Student s = new Student(name);
		
		// add student to students (by name) and students by id hashmaps.
		// putting student name into uppercase in the student name to student mapping to allow for case insensitive searching
		students.put(name.toUpperCase(), s);
		studentsById.put(s.getId(), s);
	}
	
	// look up a student by name
	private void findStudentByName() {
		
		// ask for user input
		System.out.println("Enter student's name: ");
		
		// scan user input
		String name = input.nextLine();
		
		// obtain student. student names in mapping are in uppercase
		Student s = students.get(name.toUpperCase());
		
		// if student not found, print message and return
		if (s == null) {
			System.out.println("No student found with name " + name);
			return;
		}
		
		// print student info
		printStudentInfo(s);
		
	}
	
	// the way you want the student info to print out should live in this interface
	private void printStudentInfo(Student s) {
		
		// print student name and id
		System.out.println(s.getName() + " " + s.getId());
		
		// list courses student is enrolled in
		System.out.println("Currently enrolled in:");
		for (Course c : s.getCourses()) {
			System.out.println();
		}
		
		// list grades from all completed courses. if a student has a grade assigned for a course, they are no longer enrolled in that course.
		System.out.println("Grades received:");
		for (Course c : s.getCourses()) {
			System.out.println();
		}
		
	}

	// create student name to student mapping. 
//	public void mapStudentsByName() {
//		// loop through students and populate!
//		for (Student s : this.students) {
//			this.studentsByName.put(s.getName(), s);
//		}
//	}
	
	
	// map student ids to students
	
	// 
	
	
	// load in data
	public void loadFile() {
		
	}
	
	// want to be able to save this stuff to files!
	
	
	// When looking at a course, the user should be able to see:
	// How many students are in the course
	// All students currently enrolled in the course
	// The grades given to all students who have completed the course
	// They should also be able to:
	// Create a new course in the system
	// Add a new student to the system, with a unique name and ID number
	// Enroll a student into a course
	// Assign a grade to a student in a course
	// Unenroll a student from a course
	
	// In this simplified model:
	// no two students have the same name, 
	// every student takes each course at most once, 
	// and there is no concept of different offerings of the same course.
	public static void main(String args[]) {
		// instantiate user interface
		new UserInterface();
	}
}
