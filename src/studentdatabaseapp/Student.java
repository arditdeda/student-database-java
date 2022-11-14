package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String coursers= "";
	private int tuitionbalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	//Constuctor: prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName= in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName= in.nextLine();
		
		System.out.println("1-Freshmen\n2- sohmore\n3-Junior\n4-Senior\nEnter student class level: ");
		this.gradeYear= in.nextInt();
		
		setStudentID();
		
	

	}
	
	// Generate ID
	private void setStudentID() {
		//Grade Level +ID
		id++;
		this.studentID=gradeYear +"" +id;	
		
	}
	
	
	//Enroll Courses
	public void enroll() {
		//Get inside a lopp,user hits 0
	do {	
		System.out.print("Eenter course to enroll (Q to quit)");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			coursers = coursers + "\n " + course;
			tuitionbalance = tuitionbalance + costOfCourse ;
		}
		else {break;}
	   }while(1!=0);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your Balance is: $"+ tuitionbalance);
	}
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionbalance= tuitionbalance-payment;
		System.out.println("Thanks your for payment of:$"+payment);
		viewBalance();
	}
	
	//Show status
	public  String toString() {
		return "Name:"+ firstName +" " + lastName + 
				"\nGrade Year: " + gradeYear +
				"\nStudent Id: " + studentID +
				"\nCourses Enrolled: " + coursers +
				"\nBalance: $" + tuitionbalance;
	}
}
