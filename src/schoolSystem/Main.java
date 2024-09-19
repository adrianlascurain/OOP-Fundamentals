package schoolSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolService  schoolService = new SchoolService(); 
		int registration1 = 1001;
		int registration2 = 1002;
		int registration3 = 1003;
	
		String courseName1 = "Matemáticas Avanzadas";
		String courseName2 = "Historia del Arte";
		String courseName3 = "Introducción a la Economía";
		
		schoolService.enrollStudent(registration3, courseName1);
		schoolService.courseBestGrade(courseName1);
		
		schoolService.enrollStudent(registration1, courseName3);
		
		schoolService.enrollStudent(registration2, courseName3);
		schoolService.courseBestGrade(courseName3);
		
		schoolService.enrollStudent(registration1, courseName2);
		schoolService.courseBestGrade(courseName2);
		
		schoolService.courseAverage(courseName1);
		
	}

}
