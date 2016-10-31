package src.testJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import src.mainProject.Class;
import src.mainProject.Course;
import src.mainProject.Department;
import src.mainProject.Professor;
import src.mainProject.Secretary;
import src.mainProject.Student;

public class CourseTest {
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
		professor = new Professor("Arndt Von Staa", department);
	}

	@Test
	public void testGetName() {
		assertEquals(course.getName(), "Engenharia da Computação");
	}
	
	@Test
	public void testGetSecretary() {
		assertEquals(course.getSecretary(), secretary);
	}
	
	@Test
	public void testGetClasses() {
		assertEquals(course.getClasses(), new ArrayList<Class>());
	}
	
	@Test
	public void testGetStudents() {
		assertEquals(course.getStudents(), new ArrayList<Student>());
	}
	
	@Test
	public void testAddClass() {
		ArrayList<Class> classes = course.getClasses();
		studentClass = new Class("Estruturas de Dados", "INF1620", course, 60, 0, new ArrayList<Class>(), professor, 0);
		classes.add(studentClass);
		course.addClass(studentClass);
		assertEquals(course.getClasses(), classes);
		
	}
	
	@Test
	public void testAddStudent() {
		ArrayList<Student> students = course.getStudents();
		student = new Student("Durval", 15211288, course, 100);
		students.add(student);
		course.addStudent(student);
		assertEquals(course.getStudents(), students);
		
	}

}
