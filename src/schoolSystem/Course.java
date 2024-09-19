package schoolSystem;

import java.util.HashMap;

public class Course {
	String courseName;
	String professorName;
	int year;
	HashMap<Integer,Student> studentsEnrolled = new HashMap<Integer,Student>();
	
	public Course(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}
	
   public void enroll(Student student){
	      //TODO add the student to the collection
	   		studentsEnrolled.put(student.registration, student);
	   }
   
   public void enroll(Student[] students){
	      //TODO add all the students to the collection
	   		for(Student student: students) {
	   			studentsEnrolled.put(student.registration, student);
	   		}
	   }

   public void unEnroll(Student student){
       //TODO remove this student from the collection
       // Hint: check if that really is this student
	   studentsEnrolled.remove(student.registration);
   }

   public int countStudents(){
       //TODO implement
       return studentsEnrolled.size();
   }
   
   public int bestGrade(){
       //TODO implement
	   int maxGrade = 0;
	   String studentName = "";
	   for(Student student: studentsEnrolled.values()) {
		   if(student.grade > maxGrade) {
			   maxGrade = student.grade;
			   studentName = student.firstName + " " +student.lastName;
		   } 
	   }
	   
	   System.out.println(studentName + " has the max grade with " + maxGrade + " at the course: " + this.courseName);
       return maxGrade;
   }
   
   public double calculateAverage() {
	   double average = 0.0;
	   for(Student student:studentsEnrolled.values()) {
		   average += student.grade;
	   }
	   average = average / this.countStudents();
	   return average;
   }
}
