package src.mainProject;

import java.util.ArrayList;

public class Secretary {
	Department department;
	String type;
	ArrayList<Course> courses;
	
	public Secretary(Department department, String type) {
		this.department = department;
		this.type = type;
		this.courses = new ArrayList<Course>();
		department.addSecretary(this);
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public String getType() {
		return type;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	@Override
	public String toString() {
		return "Secretaria de " + type;
	}
}
