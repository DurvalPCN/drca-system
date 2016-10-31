package src.mainProject;

import java.util.ArrayList;

public class Department {
	String name;
	ArrayList<Professor> professors;
	ArrayList<Secretary> secretaries;
	
	public Department(String name) {
		this.name = name;
		this.professors = new ArrayList<Professor>();
		this.secretaries = new ArrayList<Secretary>();
	}
	
	public void addSecretary(Secretary secretary) {
		secretaries.add(secretary);
	}
	
	public void addProfessor(Professor professor) {
		professors.add(professor);
	}

	public String getName() {
		return this.name;
	}
	
	public ArrayList<Professor> getProfessors() {
		return professors;
	}
	
	public ArrayList<Secretary> getSecretaries() {
		return secretaries;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
