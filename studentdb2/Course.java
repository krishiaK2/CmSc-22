package studentdb2;

import java.io.Serializable;

public class Course implements Serializable {
	private String courseCode;
	private String courseDescription;
	
	public Course() {
		
	}
	
	public Course(String courseCode, String courseDescription) {
		this.courseCode = courseCode;
		this.courseDescription = courseDescription;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getCourseCode(String courseCode) {
		return courseCode;
	}
	
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	public String getCourseDescription(String courseDescription) {
		return courseDescription;
	}
	
	public String toString() {
		return String.format("%s%s", courseCode, courseDescription);
	}
}