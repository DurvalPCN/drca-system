package src.testJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import src.mainProject.Department;
import src.mainProject.Professor;
import src.mainProject.Class;

public class ProfessorTest {
	
	private Department department;
	private Professor professor;
	private Class classLectured;
	
	@Before
	public void initialize() {
		department = new Department("Departamento");
		professor = new Professor("Willy", department);
	}
	
	@Test
	public void testGetName() {
		assertEquals(professor.getName(), "Willy");
	}
	
	@Test
	public void testGetDepartment() {
		assertEquals(professor.getDepartment(), department);
	}
	
	@Test
	public void testGetClasses() {
		assertEquals(professor.getClasses(), new ArrayList<Class>());
	}
	
	@Test
	public void testAddClass() {
		ArrayList<Class> classes = professor.getClasses();
		professor.addClass(classLectured);
		classes.add(classLectured);
		assertEquals(professor.getClasses(), classes);		
	}

}
