package studentdb2;

import java.io.Serializable;

public class Student implements Serializable {

	private String studentNumber;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String course;
	private int yearLevel;
	private String crushName;
	private Course faveSubject;

	public Student(String studentNumber, String firstName, char middleInitial, String lastName, String course, int yearLevel, String crushName, Course faveSubject) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.course = course;
		this.yearLevel = yearLevel;
		this.crushName = crushName;
		this.faveSubject = faveSubject;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public int getYearLevel() {
		return yearLevel;
	}
	
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public String getCrushName() {
		return crushName;
	}
	
	public void setFaveSubject(Course faveSubject) {
		this.faveSubject = faveSubject;
	}

	public Course getFaveSubject() {
		return faveSubject;
	}

	public String toString() {
		return String.format("Student Num: %s\nFirst Name: %s\nMiddle Initial: %s\nLast Name: %s\nCourse: %s\nYear Level: %d\nCrush Name: %s\n %s",studentNumber, firstName, middleInitial, lastName, course, yearLevel, crushName, faveSubject.toString());
	}

}
