package schoolSystem;

import java.util.HashMap;

public class SchoolService {
	
	HashMap<Integer,Student> students = new HashMap<Integer,Student>();
	HashMap<String,Course> courses = new HashMap<String,Course>();
	
	public SchoolService() {
	students.put( 1001,new Student("Juan", "Pérez", 1001, 85, 2024));
    students.put( 1002,new Student("Ana", "Gómez", 1002, 90, 2023));
    students.put( 1003,new Student("Luis", "Martínez", 1003, 78, 2024));
    students.put( 1004,new Student("María", "Fernández", 1004, 92, 2022));
    students.put( 1005,new Student("Carlos", "López", 1005, 88, 2023));
                
    
    courses.put("Matemáticas Avanzadas",new Course("Matemáticas Avanzadas", "Dr. Eduardo Ramírez", 2024));
    courses.put("Física Cuántica",new Course("Física Cuántica", "Dra. Clara Gómez", 2023));
    courses.put("Historia del Arte",new Course("Historia del Arte", "Prof. Juan Fernández", 2022));
    courses.put("Programación en Java",new Course("Programación en Java", "Ing. Marta Hernández", 2024));
    courses.put("Introducción a la Economía",new Course("Introducción a la Economía", "Lic. Carlos Ortega", 2023));
	}
    
	public void enrollStudent(int registration,String courseName) {
		Student student = students.get(registration);
		Course course = courses.get(courseName);
		course.enroll(student);
    }
	
	public void enrollStudents(Student[] students, String courseName) {
		Course course = courses.get(courseName);
		course.enroll(students);
	}
	
	public void unEnrollStudent(int registration,String courseName) {
		Student student = students.get(registration);
		Course course = courses.get(courseName);
		course.unEnroll(student);
    }
	
	public void courseBestGrade(String courseName) {
		Course course = courses.get(courseName);
		course.bestGrade();
	}
	
	public void courseAverage(String courseName) {
		Course course = courses.get(courseName);
		System.out.println("Average grade of " + course.courseName + " is " + course.calculateAverage());
	}
}

