package src.mainProject;

import java.util.ArrayList;

public class Course {
	String name;
	Secretary secretary;
	ArrayList<Class> classes;
	ArrayList<Student> students;
	
	public Course(String name, Secretary secretary) {
		this.name = name;
		this.secretary = secretary;
		this.classes = new ArrayList<Class>();
		this.students = new ArrayList<Student>();
		secretary.addCourse(this);
	}

	public String getName() {
		return this.name;
	}
	
	public Secretary getSecretary() {
		return secretary;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public ArrayList<Class> getClasses() {
		return this.classes;
	}
	
	public void addClass(Class classAdd) {
		this.classes.add(classAdd);
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
