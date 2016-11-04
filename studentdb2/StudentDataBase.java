package studentdb2;

import java.util.*;

public class StudentDataBase {

    public static Student getStudent(List<Student> std,String studentNum) {
        if(std.isEmpty()){
        	throw new IllegalArgumentException("Student number not found.");
        } else {
	        for (Student s: std) {
	       		if (s.getStudentNumber().equals(studentNum)) {
	       			return s;
	       		}        	       	
	        }
        }
        return null;
       	
        	
           
    }
	public static void main(String[] args) {
	     String studentNum ="";
	     String firstname ="";
	     char middleInitial;
	     String lastName ="";
	     String course ="";
	     int yearLevel = 0;
	     String crushName="";
	     String courseCode ="";
	     String courseDescription="";
	     //Course faveSubject = new Course(courseCode, courseDescription);
	    Scanner k1 = new Scanner(System.in);
		boolean terminate = false;
		FileWriting fw = new FileWriting("C://Users//asus pc//workspace//cmsc22lab13//src//studentdb2//db.txt");
		List<Student> stdLst = new ArrayList<>();
		Student s = null;
		while (terminate == false) {

			System.out.println("\nWELCOME TO UP CEBU STUDENT'S DATA BASE\n");
			System.out.println("What do you want to do?\n");
			System.out.println("1. Register a Student");
			System.out.println("2. Retrieve Student Information");
			System.out.println("3. Delete Student Data");
			System.out.println("4. SAVE");
			System.out.println("5. EXIT");

			
			int choice = k1.nextInt();

			if (choice < 1 || choice > 5) {
				System.err.println("\tError Input\n");
				terminate = false;
			}
			else if (choice == 1) {
				System.out.println("REGISTER A STUDENT\n");
				System.out.print("Student Number: ");
				studentNum = k1.next();
				System.out.print("First name: ");
				firstname = k1.next();
				System.out.print("Middle Initial: ");
				middleInitial = k1.next().charAt(0);
				System.out.print("LastName: ");
				lastName = k1.next();
				System.out.print("Program: ");
				course = k1.nextLine();
				System.out.print("Year: ");
				yearLevel = k1.nextInt();
				System.out.print("Crush Name: ");
			    crushName = k1.next();
				System.out.print("Course Code: ");
				courseCode = k1.nextLine();
				System.out.print("Course Description: ");
				courseDescription = k1.next();
				Course faveSub = new Course(courseCode, courseDescription);
				s = fw.register(studentNum, firstname, middleInitial, lastName, course, yearLevel, crushName, faveSub);	
				stdLst.add(s);
				System.out.print("\n\tStudent Added!\n");
				terminate = false;

			}
			else if (choice == 2) {
				System.out.println("RETRIEVE STUDENT INFORMATION\n");
				System.out.print("Enter Student Number: ");
				String num = k1.next();
				
				if(!stdLst.isEmpty()){
					if(getStudent(stdLst,num) != null){
						System.out.print(getStudent(stdLst,num).toString());
					}
				} else{
					System.out.print("EMPTY");
				}
				terminate = false;
			}
			else if (choice == 3) {
				System.out.println("DELETE STUDENT DATA\n");
				System.out.print("Enter Student Number: ");
				studentNum = k1.next();
				fw.delete(studentNum, stdLst);

				System.out.print("\n\tStudent " + studentNum + " Deleted\n");
				terminate = false;
			} 
			else if (choice == 4) {
				//fw.save(stdLst, s);
				System.out.print("\t...SAVED...\n");
				System.out.println(stdLst.toString());
				terminate = false;
			} else {
				terminate = true;
			}
		}
		
		System.out.print("\tGOODBYE!!!");




	}
}
