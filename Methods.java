package task01112024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Methods {
	HashMap<Integer,Book> b = new HashMap<>();
	HashMap<Integer,Student> s = new HashMap<>();
	List<LoanRecord> l =new ArrayList<>();
	Scanner in = new Scanner(System.in);
public void addBooks() {

	try {
	System.out.println("Book ID:");
	Integer id = in.nextInt();
	//id=in.nextInt();
	System.out.println("Book title:");
	String title=in.nextLine();
	title=in.nextLine();
	System.out.println("Book Author");
	String author=in.nextLine();
	int s = b.size();
	b.put(id, new Book(id,title,author,true));
	if(s<b.size()) {
	System.out.println("book added successfully with the bid  "+id);
	}
	else {
	throw new MyException(" Book Not Added");
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
}

public void registerStudent() {

	try {
		System.out.println("Student ID");
		Integer sid=in.nextInt();
		System.out.println("Student Name:");
		String name = in.nextLine();
		name=in.nextLine();
		int len=s.size();
		s.put(sid,new Student(sid,name,true));
		if(len<s.size()) {
			System.out.println("Student Registered Successfully");
		}
		else
		{
			throw new MyException("Student Not Registered");
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
}

public void loaningBooks() {

	try {
	System.out.println("Enter sid of the student");
	Integer sid=in.nextInt();
	Integer lid=0;
	if(s.containsKey(sid)) {
		Student student = s.get(sid);
		if(student !=null && student.isMembershipStatus()) {
				System.out.println("Enter number of books:");
				int n = in.nextInt();
				if(n<=2 && n>0) {
					lid++;
					for(int i=0;i<n;i++) {
						System.out.println("Enter book bid");
						int bid=in.nextInt();
						if(b.containsKey(bid)) {
							Book book = b.get(bid);
							if(book!=null && book.isAvailable()) {
								LocalDate date = LocalDate.now();
								String dateString = date.toString();
								LocalDate dateAfterTenDays = date.plusDays(10);
								String afterTenDays=dateAfterTenDays.toString();
								int len=l.size();
								l.add(new LoanRecord(lid,dateString,afterTenDays,bid,sid));
								if(len<l.size()) {
								System.out.println("Book Loaned Successfully!");
								System.out.println("The book Return date is :"+afterTenDays);
								book.setAvailable(false);
								}
								else {
									throw new MyException("Book not Loaned");
								}

							}
							
						}
					}
			}
				else 
					System.out.println("Inalid Book count!");
				}
		}
	else
		System.out.println("Student data not found with the specified sid");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}

}

public void returnBooks() {

	try {
		System.out.println("Enter the Loan id");
		Integer lid=in.nextInt();
		for(LoanRecord a:l) {
			if(a.getLid()==lid) {
				int b1 =a.bid;
				Book books = b.get(b1);
				books.setAvailable(true);
			}
		
	}
		System.out.println("Book Returned successfully");

}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}

public void displayLoanRecords() {
	if(!l.isEmpty()) {
	System.out.println(l);
}
	else
	{
		System.out.println("No Records Found");
	}
}

public void displayStudentRecords() {
	if(!s.isEmpty()) {
	System.out.println(s);
	}
	else {
		System.out.println("Student Records are empty");
	}
}

public void displayBookRecords() {

	if(!b.isEmpty()) {
		System.out.println(b);
	}
	else {
		System.out.println("Book Records are Empty");
	}
}

public void lines() {
	System.out.println("=====================================");
}
}
