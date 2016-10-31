package src.testJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import src.mainProject.Student;
import src.mainProject.Course;
import src.mainProject.Class;
import src.mainProject.Department;
import src.mainProject.Professor;
import src.mainProject.Secretary;

public class StudentTest {
	private Department department;
	private Secretary secretary;
	private Student student;
	private Course course;
	private Professor professor;
	private Class studentClass;
	
	@Before
	public void initialize() {
		department = new Department("Departamento de Informatica");
		secretary = new Secretary(department, "Graduação");
		course = new Course("Engenharia da Computação", secretary);
		student = new Student("Durval", 15211288, course, 100);
		professor = new Professor("Arndt Von Staa", department);
		studentClass = new Class("Estruturas de Dados", "INF1620", course, 60, 0, new ArrayList<Class>(), professor, 0);
	}
	
	@Test
	public void testStudentInstanceOne() {
		Student victor = new Student("Victor", 13122311, course, 350, new ArrayList<Class>());
		assertEquals(victor.getName(), "Victor");
	}

	@Test
	public void testStudentInstanceTwo() {
		Student durval = new Student("Durval", 13122311, course, 350);
		assertEquals(durval.getCourse(), course);
	}
	
	@Test
	public void testStudentGetName() {
		assertEquals(student.getName(), "Durval");
	}

	@Test
	public void testStudentGetMatricula() {
		assertEquals(student.getMatricula(), 15211288);
	}

	@Test
	public void testStudentGetCourse() {
		assertEquals(student.getCourse(), course);
	}

	@Test
	public void testStudentGetCredits() {
		assertEquals(student.getCredits(), 100);
	}

	@Test
	public void testStudentAddCredits() {
		student.addCredits(100);
		assertEquals(student.getCredits(), 200);
	}
	
	@Test
	public void testStudentAddClass() {
		ArrayList<Class> testArray = student.getClasses();
		testArray.add(studentClass);
		student.addClass(studentClass);
		assertEquals(student.getClasses(), testArray);
		
	}
}
