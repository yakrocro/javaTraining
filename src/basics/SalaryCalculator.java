package basics;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		
		//Declaring variable
		String carrier ;
		StringBuilder job = new StringBuilder("Java Dev");
		job.append("eloper");
		System.out.println("Program is starting...");
		
		//Defining variable
		carrier = "Software developper";
		System.out.println("My carrier is : " + carrier);
		
		//Declaring and defining variable
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		double salary = hoursPerWeek * weeksPerYear * rate ;
		
		System.out.println("My salary as " + job + " at the rate " +
		rate + " per hour is "+ salary + " $, per year.");
		
	}

}
