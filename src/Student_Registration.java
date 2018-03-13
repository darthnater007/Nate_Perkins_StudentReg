import java.util.Scanner;

public class Student_Registration {

	public static void main(String[] args) {
		//Welcome
		System.out.println("Student Registration Form\n\n");
		//Set up Scanner
		Scanner sc = new Scanner(System.in);
		//gather user input
		System.out.print("Enter your first name: ");
		String fname= sc.next();
		System.out.println();
		System.out.print("Enter your last name: ");
		String lname= sc.next();
		System.out.println();
		System.out.print("Enter your year of birth: ");
		String birthdate= sc.next();
		System.out.println("\n");
		System.out.println("Welcome " + fname + " " + lname +
				"\nYour Registration is complete. \n"
				+ "Your temporary password is: " + fname + "*" + birthdate);
		
	}

}
