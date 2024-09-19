package schoolSystem;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;
    }
    
    public Student(String firstName, String lastName, int registration) {
    	this(firstName, lastName, registration,0,1);
    }
    
    public Student(String firstName, String lastName, int registration, int grade) {
    	this(firstName, lastName, registration,grade,1);
    }
    
    public void printFullName(){
        //TODO implement
    	System.out.println(firstName + " " + lastName);
     }

     public boolean isApproved(int grade){
         //TODO implement: should return true if grade >= 60
    	 return (grade >= 60)? true : false;
     }

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
         if(this.isApproved(this.grade)) {
        	 System.out.println("Congratulations you passed from year " + this.year + " to year " + (++this.year) );
        	 System.out.println(this.year);
         }
    	 return this.year;
     }   
}
