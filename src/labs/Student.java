package labs;

import java.util.ArrayList;

public class Student {
	
	public static void main(String[] args) {
		Student student = new Student("Jay", "8765430");
		student.enroll("Math");
		student.enroll("French");
		System.out.println(student);
	}

	public String name ;
	public String SSN ;
	private static int ID = 1000 ;
	private String emailID ;
	private String userID ;
	private int phone ;
	private String city = "";
	private String state = "";
	private double balance = 0.0;
	private ArrayList<String> courses = new ArrayList<>();
	private static int costOfCourse = 800 ;

	public Student(String name, String SSN) {
		if( name != "" && SSN != "") {
			this.name = name ;
			this.SSN = SSN ;
			this.setEmailID();
			this.setUserId();
			this.ID++ ;
		}
		
	}

	private void setEmailID() {
		this.emailID = name + "@student.com" ;
	}

	private void setUserId() {
		int max = 9000 ;
		int min = 1000 ;
		int randum = (int)(Math.random() * (max -min)) + min ;
		this.userID =   this.ID + "" + randum + this.SSN.substring(this.SSN.length() - 4);
	}

	public void enroll(String course) {
		this.courses.add(course) ;
		this.balance = this.balance - this.costOfCourse ;
	}

	public void pay(double amount) {
		this.balance = this.balance - amount ;
		this.checkBalance();
	}

	public void checkBalance() {
		System.out.println("Balance : " + this.balance);
	}

	public void showCourses() {
		for( String course : this.courses) {
			System.out.println(course);
		}
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "[ name : " + this.name + " ]\n" +
			   "[ SSN : " + this.SSN + " ]\n" +
			   "[ emailID : " + this.emailID + " ]\n" + 
			   "[ userID : " + this.userID + " ]\n" + 
			   "[ phone : " + this.phone + " ]\n" + 
			   "[ city : " + this.city + " ]\n" +  
			   "[ state : " + this.state + " ]\n" + 
			   "[ balance : " + this.balance + " ]\n" +  
			   "[ courses: " + this.courses.toString() + " ]\n" +  
			   "[ number of courses: " + this.courses.size() + " ]\n";
	}

}
