// Import the Scanner class from java.util package
import java.util.Scanner;

public class Second
{
	// Below is a main method
	// it is an entry point of your Java program
	public static void main(String [] args)
	{
		// Create or Define a Scanner object variable
		Scanner nameScanner = new Scanner(System.in);  
		Scanner salaryScanner = new Scanner(System.in);  

		// Read user input, store into variable called userName
		System.out.println("Enter username");
		String userName = nameScanner.nextLine();  

		System.out.println("Enter Salary");
		String salary  = salaryScanner.nextLine();  

		System.out.println("Username is: " + userName + "!!!" );System.out.println("Salary is: " + salary + "!!!" );  
	}	
}
