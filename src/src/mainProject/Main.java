package src.mainProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

	// creating DEPARTMENTS
	Department dptInformatica = new Department("Departamento de Informatica");
	Department dptLetras = new Department("Departamento de Letras");
	
	// creating SECRETARIES
	Secretary secInfGrad = new Secretary(dptInformatica, "Graduação");
	Secretary secInfPos = new Secretary(dptInformatica, "Pós-Graduação");
	Secretary secLetGrad = new Secretary(dptLetras, "Graduação");
	
	// creating COURSES
	Course engenharia = new Course("Engenharia da Computação", secInfGrad);
	Course bacharelado = new Course("Bacharelado em Computação", secInfGrad);
	Course doutorado = new Course("Doutorado em Informática", secInfPos);
	Course portIngles = new Course("Português - Inglês", secLetGrad);
	
	
	// creating PROFESSORS
	Professor arndtVonStaa = new Professor("Arndt Von Staa", dptInformatica);
	Professor marcusPoggi = new Professor("Marcus Poggi", dptInformatica);
	Professor carlosLucena = new Professor("Carlos Lucena", dptInformatica);
	Professor brunoFeijo = new Professor("Bruno Feijó", dptInformatica);
	Professor danielSchawbe = new Professor("Daniel Schawbe", dptInformatica);
	Professor angelaSouza = new Professor("Ângela Souza", dptLetras);
	
	// creating CLASSES
		// CLASSES FROM ENGENHARIA
		// adding class INF1620
		Class INF1620 = new Class("Estruturas de Dados", "INF1620", engenharia, 60, 0, new ArrayList<Class>(), marcusPoggi, 0);
		
		// adding class INF1622
		ArrayList<Class> preINF1622 = new ArrayList<Class>();
		preINF1622.add(INF1620);
		Class INF1622 = new Class("Laboratorio de Programacao I", "INF1622", engenharia, 70, 0, preINF1622, arndtVonStaa, 1);
		
		// adding class INF1628
		Class INF1628 = new Class("Programação em ponto grande", "INF1628", engenharia, 50, 0, preINF1622, arndtVonStaa, 1);
		
		//adding class INF1624
		ArrayList<Class> preINF1624 = new ArrayList<Class>();
		preINF1624.add(INF1620);
		preINF1624.add(INF1628);
		Class INF1624 = new Class("Projeto de Sistema de Software I", "INF1624", engenharia, 40, 0, preINF1624, carlosLucena, 1);
		
		// CLASSES FROM BACHARELADO
		// adding class INF1001
		Class INF1001 = new Class("Introdução a Ciência da Computação", "INF1001", bacharelado, 40, 0, new ArrayList<Class>(), brunoFeijo, 1);
		
		// adding class INF1002
		Class INF1002 = new Class("Cálculo Númerico", "INF1002", bacharelado, 40, 100, new ArrayList<Class>(), marcusPoggi, 1);
		
		// adding class INF1600
		Class INF1600 = new Class("Software Básico", "INF1600", bacharelado, 50, 40, new ArrayList<Class>(), arndtVonStaa, 1);
		
		// CLASSES FROM DOUTORADO
		Class INF1303 = new Class("Hipermídia Adaptativa", "INF1303", doutorado, 30, 0, new ArrayList<Class>(), danielSchawbe, 1);
		
		// CLASSES FROM PORT-INGLES
		Class LET1501 = new Class("Inglês I", "LET1501", portIngles, 30, 0, new ArrayList<Class>(), angelaSouza, 1);
	
	// creating STUDENTS
		// creating Alex
		ArrayList<Class> alexClasses = new ArrayList<Class>();
		alexClasses.add(INF1620);
		alexClasses.add(INF1628);
		alexClasses.add(INF1622);
		Student alexCarvalho = new Student("Alex Carvalho", 98124812, engenharia, 180, alexClasses);
		
		// creating Jurema
		ArrayList<Class> juremaClasses = new ArrayList<Class>();
		juremaClasses.add(INF1620);
		juremaClasses.add(INF1001);
		Student juremaTorres = new Student("Jurema Torres", 9924812, engenharia, 100, juremaClasses);
		
		// creating Jose
		Student joseVasconcelos = new Student("José Vasconcelos", 9915918, bacharelado, 0, new ArrayList<Class>());
		
		// creating Joao
		Student joaoSilva = new Student("João da Silva", 9914918, doutorado, 0, new ArrayList<Class>());
		
		// creating Maria
		Student mariaAntonio = new Student("Maria Antônia", 12398, portIngles, 0, new ArrayList<Class>());

		ArrayList<Student> listStudents = new ArrayList<Student>();
		for(int i=0; i<engenharia.students.size(); i++)
			listStudents.add(engenharia.students.get(i));
		for(int i=0; i<bacharelado.students.size(); i++)
			listStudents.add(bacharelado.students.get(i));
		for(int i=0; i<doutorado.students.size(); i++)
			listStudents.add(doutorado.students.get(i));
		for(int i=0; i<portIngles.students.size(); i++)
			listStudents.add(portIngles.students.get(i));
		
		ArrayList<Student> allStudents = new ArrayList<Student>();
	
	// MENU
	boolean mainMenu = true;
	while(mainMenu == true) {
		System.out.println("------------------------------");
		System.out.println("");
		System.out.println("  SISTEMA DE GERENCIAMENTO");
		System.out.println("    DE MATRICULAS - DRCA");
		System.out.println("");
		System.out.println("Digite um número para acessar");
		System.out.println("a função desejada:");
		System.out.println("");
		System.out.println("<1> Processar Matrículas");
		System.out.println("<2> Listar Departamentos");
		System.out.println("<3> Gerar Comprovantes");
		System.out.println("<4> Sair");
		System.out.println("");
		System.out.println("------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		int menuSelection = scanner.nextInt();
		
		switch(menuSelection) {
			case 1:
				System.out.println("Listando alunos dos cursos de:");
				System.out.println("Departamento de Informática\nEngenharia");
				for(int i=0; i<engenharia.students.size(); i++) {
					System.out.println(i+1 + " - Nome: " + engenharia.students.get(i).getName() + ", Matrícula: " + engenharia.students.get(i).getMatricula());
					allStudents.add(engenharia.students.get(i));
				}
				System.out.println("\nBacharelado");
				for(int i=0; i<bacharelado.students.size(); i++) {
					System.out.println(i+1 + " - Nome: " + bacharelado.students.get(i).getName() + ", Matrícula: " + bacharelado.students.get(i).getMatricula());
					allStudents.add(bacharelado.students.get(i));
				}
				System.out.println("\nDoutorado");
				for(int i=0; i<doutorado.students.size(); i++) {
					System.out.println(i+1 + " - Nome: " + doutorado.students.get(i).getName() + ", Matrícula: " + doutorado.students.get(i).getMatricula());
					allStudents.add(doutorado.students.get(i));
				}
				System.out.println("\n\nDepartamento de Letras\nportIngles");
				for(int i=0; i<portIngles.students.size(); i++) {
					System.out.println(i+1 + " - Nome: " + portIngles.students.get(i).getName() + ", Matrícula: " + portIngles.students.get(i).getMatricula());
					allStudents.add(portIngles.students.get(i));
				}
				
				System.out.println("\n\nPara mais informações sobre algum aluno, digite seu número de matricula:");
				int matriculaSearch = scanner.nextInt();
				
				boolean matriculaWasFounded = false;
				
				for(int i = 0; i<allStudents.size(); i++) {
					if(allStudents.get(i).getMatricula() == matriculaSearch) {
						matriculaWasFounded = true;
						Student foundedStudent = allStudents.get(i);
						ArrayList<Class> dptAllClasses = new ArrayList<Class>(); 
						System.out.println("O(A) aluno(a) pertence ao:");
						Course course = allStudents.get(i).getCourse();
						Department dptStudent = course.getSecretary().getDepartment();
						System.out.println(dptStudent.getName());
						System.out.println("Listando disciplinas:");
						ArrayList<Secretary> dptSecretaries = dptStudent.getSecretaries();
						for(int z=0; z<dptSecretaries.size(); z++) {
							System.out.println("Secretaria " + dptSecretaries.get(z).getType());
							ArrayList<Course> dptCourses = dptSecretaries.get(z).getCourses();
							for(int t=0; t<dptCourses.size(); t++) {
								System.out.println("Curso " + dptCourses.get(t).getName());
								System.out.println("Matérias: " + dptCourses.get(t).getClasses());
								for(int w=0; w<dptCourses.get(t).getClasses().size(); w++)
									dptAllClasses.add(dptCourses.get(t).getClasses().get(w));
							}
						}

						System.out.println("\n\nDigite o código da disciplina a ser inserida na matrícula do aluno:");
						scanner.nextLine();
						String disciplinaSearch = scanner.nextLine();
						
						boolean disciplinaWasFounded = false;
						for(int z=0; z<dptAllClasses.size(); z++) {
							if(dptAllClasses.get(z).getCode().equals(disciplinaSearch)) {
								disciplinaWasFounded = true;
								Class foundedClass = dptAllClasses.get(z);
								String classType = foundedClass.getCourse().getSecretary().getType();
								String studentType = foundedStudent.getCourse().getSecretary().getType();
								if(classType.equals("Pós-Graduação") && studentType.equals("Graduação")) {
									if(foundedStudent.getCredits() >= 170) {
										System.out.println("Matricula realizada!");
										foundedStudent.addClass(foundedClass);
									}
									else
										System.out.println("O graduando não tem créditos o bastante para cursar disciplina de Pós-Graduação.");
								}
								else if(foundedClass.getStatus() == 0)
									System.out.println("Essa disciplina não está sendo oferecida!");
								else if(foundedStudent.getClasses().contains(foundedClass))
									System.out.println("O aluno já está matriculado/já cursou nessa disciplina!");
								else {
									if(foundedStudent.getCredits() < foundedClass.getMinCredits())
										System.out.println("O aluno não possui créditos o bastante!");
									else if(!foundedClass.getPreClasses().isEmpty()) {
										if(foundedStudent.getClasses().containsAll(foundedClass.getPreClasses())) {
											System.out.println("Matricula realizada!");
											foundedStudent.addClass(foundedClass);
										}
										else {
											System.out.println("A matéria tem pré-requisito! O aluno precisa pagar:");
											System.out.println(foundedClass.getPreClasses());
										}
									}
									else {
										System.out.println("Matricula realizada!");
										foundedStudent.addClass(foundedClass);
									}
								}
							}
						}
						if(disciplinaWasFounded == false)
							System.out.println("Disciplina não encontrada, cheque se existe na grade!");
						
					}
				}
				if(matriculaWasFounded == false)
					System.out.println("Matrícula não encontrada!");
				System.out.println("Digite ENTER para prosseguir");
				scanner.nextLine();
				//mainMenu = false;
				break;
			case 2:
				System.out.println("Departamentos disponíveis para acesso:");
				System.out.println("<1> " + dptInformatica);
				System.out.println("<2> " + dptLetras);
				int subMenuSelection = scanner.nextInt();
				switch(subMenuSelection) {
				case 1:
					System.out.println("Dados do " + dptInformatica);
					ArrayList<Secretary> dptInfSecretaries = dptInformatica.getSecretaries();
					ArrayList<Class> dptInfClasses = new ArrayList<Class>();
					for(int i=0; i<dptInfSecretaries.size(); i++) {
						Secretary secretary = dptInfSecretaries.get(i);
						System.out.println(secretary);
						for(int z=0; z<secretary.getCourses().size(); z++) {
							Course course = secretary.getCourses().get(z);
							System.out.println("\nDisciplinas de " + course);
							for(int w=0; w<course.getClasses().size(); w++) {
								Class courseClass = course.getClasses().get(w);
								System.out.println("Nome: " + courseClass.getName() + " / Código: " + courseClass.getCode());
								dptInfClasses.add(courseClass);
							}
						}
					}
					System.out.println("\nDigite o código da disciplina a visualizar:");
					scanner.nextLine();
					String classCodeView = scanner.nextLine();
					for(int z=0; z<dptInfClasses.size(); z++) {
						if(dptInfClasses.get(z).getCode().equals(classCodeView)) {
							Class foundedClass = dptInfClasses.get(z);
							System.out.println("Detalhes da disciplina");
							System.out.println(foundedClass);
							System.out.println("\nAlunos que estão cursando:");
							for(int w=0; w<engenharia.getStudents().size(); w++) {
								if(engenharia.getStudents().get(w).getClasses().contains(foundedClass))
									System.out.println("Nome: " + engenharia.getStudents().get(w).getName() + " / Matrícula: " + engenharia.getStudents().get(w).getMatricula());
							}
							for(int w=0; w<bacharelado.getStudents().size(); w++) {
								if(bacharelado.getStudents().get(w).getClasses().contains(foundedClass))
									System.out.println("Nome: " + bacharelado.getStudents().get(w).getName() + " / Matrícula: " + bacharelado.getStudents().get(w).getMatricula());
							}
							for(int w=0; w<doutorado.getStudents().size(); w++) {
								if(doutorado.getStudents().get(w).getClasses().contains(foundedClass))
									System.out.println("Nome: " + doutorado.getStudents().get(w).getName() + " / Matrícula: " + doutorado.getStudents().get(w).getMatricula());
							}
						}
					}
					System.out.println("Digite ENTER para prosseguir");
					scanner.nextLine();
					break;
				case 2:
					System.out.println("Dados do " + dptLetras);
					ArrayList<Secretary> dptLetSecretaries = dptLetras.getSecretaries();
					ArrayList<Class> dptLetClasses = new ArrayList<Class>();
					for(int i=0; i<dptLetSecretaries.size(); i++) {
						Secretary secretary = dptLetSecretaries.get(i);
						System.out.println(secretary);
						for(int z=0; z<secretary.getCourses().size(); z++) {
							Course course = secretary.getCourses().get(z);
							System.out.println("\nDisciplinas de " + course);
							for(int w=0; w<course.getClasses().size(); w++) {
								Class courseClass = course.getClasses().get(w);
								System.out.println("Nome: " + courseClass.getName() + " / Código: " + courseClass.getCode());
								dptLetClasses.add(courseClass);
							}
						}
					}
					System.out.println("\nDigite o código da disciplina a visualizar:");
					scanner.nextLine();
					classCodeView = scanner.nextLine();
					for(int z=0; z<dptLetClasses.size(); z++) {
						if(dptLetClasses.get(z).getCode().equals(classCodeView)) {
							Class foundedClass = dptLetClasses.get(z);
							System.out.println("Detalhes da disciplina");
							System.out.println(foundedClass);
							System.out.println("\nAlunos que estão cursando:");
							for(int w=0; w<portIngles.getStudents().size(); w++) {
								if(portIngles.getStudents().get(w).getClasses().contains(foundedClass))
									System.out.println("Nome: " + portIngles.getStudents().get(w).getName() + " / Matrícula: " + portIngles.getStudents().get(w).getMatricula());
							}
						}
					}
					System.out.println("Digite ENTER para prosseguir");
					scanner.nextLine();
				}
				break;
			case 3:
				System.out.println("Gerando lista de alunos\n");
				for(int i=0;i<listStudents.size(); i++)
					System.out.println("Nome: " + listStudents.get(i).getName() + " / Matricula: " + listStudents.get(i).getMatricula());
				
				System.out.println("\n\nPara mais informações sobre algum aluno, digite seu número de matricula:");
				matriculaSearch = scanner.nextInt();
				
				for(int i=0;i<listStudents.size(); i++) {
					if(listStudents.get(i).getMatricula() == matriculaSearch) {
						Student student = listStudents.get(i);
						System.out.println("Nome: " + student.getName());
						System.out.println("Número de Matricula: " + student.getMatricula());
						System.out.println("Disciplinas:");
						if(student.getClasses().isEmpty())
							System.out.println("  Sem disciplinas no momento.");
						else {
							for(int z=0;z<student.getClasses().size();z++) {
								Class currentClass = student.getClasses().get(z);
								System.out.println("  " + currentClass.getName());
								System.out.println("    Código: " + currentClass.getCode());
								System.out.println("    Professor: " + currentClass.getProfessor());
							}
						}
					}
				}
				System.out.println("Digite ENTER para prosseguir");
				scanner.nextLine();
				scanner.nextLine();
				break;
			case 4:
				System.out.println("Fechando sistema.");
				mainMenu = false;
				break;
			default:
				System.out.println("Insira um valor válido!");
		}
	}
	
}
}
