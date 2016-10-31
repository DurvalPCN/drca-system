package src.testJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import src.mainProject.Department;
import src.mainProject.Professor;
import src.mainProject.Secretary;

public class DepartmentTest {
	
	private Department department;
	private Professor professor;
	private Secretary secretary;
	
	@Before
	public void initialize() {
		department = new Department("Departamento");
		professor = new Professor("Willy", department);
		secretary = new Secretary(department, "Graduação");
	}
	
	@Test
	public void testDepartmentGetName() {
		assertEquals(department.getName(), "Departamento");
	}
	
	@Test
	public void testDepartmentGetProfessors() {
		assertEquals(department.getProfessors(), new ArrayList<Professor>());
	}
	
	@Test
	public void testDepartmentAddProfessor() {
		ArrayList<Professor> professors = department.getProfessors();
		department.addProfessor(professor);
		professors.add(professor);
		assertEquals(department.getProfessors(), professors);
	}	
	
	@Test
	public void testDepartmentAddSecretary() {
		ArrayList<Secretary> secretaries = department.getSecretaries();
		department.addSecretary(secretary);
		secretaries.add(secretary);
		assertEquals(department.getSecretaries(), secretaries);
	}
}
