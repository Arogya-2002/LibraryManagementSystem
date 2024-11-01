package task01112024;

import java.util.Scanner;

public class LibraryManagementSystem extends Methods{
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	LibraryManagementSystem lms=new LibraryManagementSystem();
	boolean flag=true;
	while(flag) {
		System.out.println("1.To add a book"
				+ "\n2.To register a student"
				+ "\n3.To Loan a book"
				+ "\n 4. To return a book"
				+ "\n 5. To display loan records"
				+ "\n6. To display Student records"
				+ "\n7.To Display book records"
				+ "\n8.Exit"
				+ "\n Enter your choice:");
		int choice = in.nextInt();
		switch(choice) {
		case 1:{
			lms.addBooks();
			lms.lines();
			break;
		}
		case 2:{
			lms.registerStudent();
			lms.lines();
			break;
		}
		case 3:{
			lms.loaningBooks();
			lms.lines();
			break;
		}
		case 4:{
			lms.returnBooks();
			lms.lines();
			break;
		}
		case 5:{
			lms.displayLoanRecords();
			lms.lines();
			break;
		}
		case 6:{
			lms.displayStudentRecords();
			lms.lines();
			break;
		}
		case 7:{
			lms.displayBookRecords();
			lms.lines();
			break;
		}
		case 8:{
			flag=false;
			System.out.println("Exiting......");
			break;
		}
		default:{
			System.out.println("Invalid input");
			lms.lines();
		}
		}
	}
	in.close();
}
}
