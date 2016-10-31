package src.testJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import src.mainProject.Course;
import src.mainProject.Department;
import src.mainProject.Secretary;

public class SecretaryTest {	
	private Department department;
	private Secretary secretary;
	private Course course;
	
	@Before
	public void initialize() {
		department = new Department("Departamento");
		secretary = new Secretary(department, "Graduação");
		course = new Course("Engenharia", secretary);
	}
	
	@Test
	public void testGetDepartment() {
		assertEquals(secretary.getDepartment(), department);
	}
	
	@Test
	public void testGetType() {
		assertEquals(secretary.getType(), "Graduação");
	}
	
	@Test
	public void testAddCourse() {
		ArrayList<Course> courses = secretary.getCourses();
		secretary.addCourse(course);
		courses.add(course);
		assertEquals(secretary.getCourses(), courses);
	}

}
