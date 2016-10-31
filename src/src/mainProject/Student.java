package src.mainProject;

import java.util.ArrayList;

public class Student {
	String name;
	int matricula;
	Course course;
	int totalCredits;
	ArrayList<Class> totalClasses;
	
	public Student(String name, int matricula, Course course, int totalCredits, ArrayList<Class> totalClasses) {
		this.name = name;
		this.matricula = matricula;
		this.course = course;
		this.totalCredits = totalCredits;
		this.totalClasses = totalClasses;
		course.addStudent(this);
	}

	public Student(String name, int matricula, Course course, int totalCredits) {
		this.name = name;
		this.matricula = matricula;
		this.course = course;
		this.totalCredits = totalCredits;
		this.totalClasses = new ArrayList<Class>();
		course.addStudent(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public Course getCourse() {
		return this.course;
	}
	
	public ArrayList<Class> getClasses() { 
		return this.totalClasses;
	}
	
	public int getCredits() {
		return this.totalCredits;
	}
	
	public void addCredits(int credit) {
		this.totalCredits += credit;
	}
	
	public void addClass(Class classAdd) {
		totalClasses.add(classAdd);
		this.totalCredits += classAdd.credits;
	}
	
	@Override
	public String toString() {
		return "Nome: " + name + "\nMatrícula: " + matricula + "\nCréditos: " + totalCredits + "\nMatérias Pagas: " + totalClasses;
	}
}
