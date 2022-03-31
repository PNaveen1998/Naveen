package studentmanagement;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int menu=0,pw=0000;
		System.out.println("Welcome to student management system");
		System.out.println("Alredy you have account directly go to login page");
		System.out.println("Enter which one want you select");
		System.out.println("1: Login");
		System.out.println("2: Signin");
		System.out.println("3: Exit");
		Scanner a=new Scanner(System.in);
		menu=a.nextInt();
		switch(menu)
		{
		case 1:
			System.out.println("Login to student management system");
			System.out.println("Enter your student id");
			Scanner b=new Scanner(System.in);
			int pw1=b.nextInt();
			System.out.println("Enter your password");
			Scanner c=new Scanner(System.in);
			int pw2=c.nextInt();
			if(pw==pw2)
			{
				System.out.println("Welcome student");
				System.out.println("Update Student Profile");
				System.out.println("Enter Student name");
				Scanner b1=new Scanner(System.in);
				String name=b1.nextLine();
				System.out.println("Enter Student id");
				Scanner b2=new Scanner(System.in);
				String id=b2.nextLine();
				System.out.println("Enter Student Course");
				Scanner l1=new Scanner(System.in);
				String course=l1.nextLine();
				System.out.println("Enter Student Stream");
				Scanner l2=new Scanner(System.in);
				String stream=l2.nextLine();
				System.out.println("Enter Student Fee");
				Scanner l3=new Scanner(System.in);
				String fee=l3.nextLine();
				System.out.println("Enter Student father name");
				Scanner b3=new Scanner(System.in);
				String fathername=b3.nextLine();
				System.out.println("Enter Student mother name");
				Scanner b4=new Scanner(System.in);
				String mothername=b4.nextLine();
				System.out.println("Enter Student Address");
				Scanner b5=new Scanner(System.in);
				String address=b5.nextLine();
				System.out.println("Enter Student mobile number");
				Scanner b6=new Scanner(System.in);
				String mobileno=b6.nextLine();
				System.out.println("Student Name: "+name);
				System.out.println("Student ID: "+id);
				System.out.println("Student Course: "+course);
				System.out.println("Student Stream: "+stream);
				System.out.println("Student Fee: "+fee);
				System.out.println("Father Name: "+fathername);
				System.out.println("Mother Name: "+mothername);
				System.out.println("Student Address: "+address);
				System.out.println("Student Mobile No: "+mobileno);
				System.out.println("Verify above details are correct enter 1 else enter 0");
				Scanner a4=new Scanner(System.in);
				int pw5=a4.nextInt();
				int x=1;
			    if(x==pw5) {
				System.out.println("Successfully update student profile");}
			    else System.out.println("Edit details");
			}
			else System.out.println("Enter valid student id and password");
break;
		case 2:
			System.out.println("Signin to student management system");
			System.out.println("Enter Student name");
			Scanner b1=new Scanner(System.in);
			String name=b1.nextLine();
			System.out.println("Enter Student id");
			Scanner b2=new Scanner(System.in);
			String id=b2.nextLine();
			System.out.println("Enter Student father name");
			Scanner b3=new Scanner(System.in);
			String fathername=b3.nextLine();
			System.out.println("Enter Student mother name");
			Scanner b4=new Scanner(System.in);
			String mothername=b4.nextLine();
			System.out.println("Enter Student Address");
			Scanner b5=new Scanner(System.in);
			String address=b5.nextLine();
			System.out.println("Enter Student mobile number");
			Scanner b6=new Scanner(System.in);
			String mobileno=b6.nextLine();
			System.out.println("Enter your password use only numbers");
			Scanner a6=new Scanner(System.in);
			int pw3=a6.nextInt();
			System.out.println("ReEnter your password");
			Scanner a2=new Scanner(System.in);
			pw2=a2.nextInt();
			System.out.println("Student Name: "+name);
			System.out.println("Student ID: "+id);
			System.out.println("Father Name: "+fathername);
			System.out.println("Mother Name: "+mothername);
			System.out.println("Student Address: "+address);
			System.out.println("Student Mobile No: "+mobileno);
			System.out.println("Verify above details are correct enter 1 else enter 0");
			Scanner a4=new Scanner(System.in);
			int pw5=a4.nextInt();
			int x=1;
		    if(x==pw5) {
			System.out.println("Successfully create student account");}
		    else System.out.println("Edit details");
		    break;
		case 3:
			System.out.println("Exit successfully");
			}

}}
