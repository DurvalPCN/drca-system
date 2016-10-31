package src.mainProject;

import java.util.ArrayList;

public class Professor {
	String name;
	Department department;
	ArrayList<Class> classesLectured;
	
	public Professor(String name, Department department) {
		this.name = name;
		this.department = department;
		this.classesLectured = new ArrayList<Class>();
	}
	
	public String getName() {
		return name;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public ArrayList<Class> getClasses() {
		return classesLectured;
	}
	
	public void addClass(Class classLectured) {
		this.classesLectured.add(classLectured);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
