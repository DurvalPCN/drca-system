package src.mainProject;

import java.util.ArrayList;

public class Class {
	String name;
	String code;
	int credits;
	int minCredits;
	ArrayList<Class> preClasses;
	Course course;
	Professor professor;
	int offered;
	
	public Class(String name, String code, Course course, int credits, int minCredits, ArrayList<Class> preClasses, Professor professor, int offered) {
		this.name = name;
		this.code = code;
		this.course = course;
		this.credits = credits;
		this.minCredits = minCredits;
		this.preClasses = preClasses;
		this.professor = professor;
		this.offered = offered;
		professor.addClass(this);
		course.addClass(this);
	}

	public Class(String name, String code, Course course, int credits, Professor professor, int offered) {
		this.name = name;
		this.code = code;
		this.course = course;
		this.credits = credits;
		this.minCredits = 0;
		this.preClasses = new ArrayList<Class>();
		this.professor = professor;
		this.offered = offered;
		professor.addClass(this);
		course.addClass(this);
	}
	
	public String getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public int getMinCredits() {
		return minCredits;
	}
	
	public ArrayList<Class> getPreClasses() {
		return preClasses;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public int getStatus() {
		return offered;
	}
	
	@Override
	public String toString() {
		return "Nome: " + name + "\nCódigo: " + code + "\nCurso: " + course + "\nCréditos: " + credits + "\nCréditos Necessários: " + minCredits +  "\nProfessor:" + professor + "\nPré-Requisitos: " + preClasses + "\n"; 
	}
}
