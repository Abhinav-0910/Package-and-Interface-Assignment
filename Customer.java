package Details;
import java.util.Scanner;

interface Person_details{
	Scanner scanner=new Scanner(System.in);
	void Name();
	void Phone_no();
	void Date_of_birth();
	void Display();
}

public class Customer implements Person_details{
	Scanner scanner=new Scanner(System.in);
	public String name;
	public long phoneNo;
	public String DOB, status;
	
    public void Name(){
		System.out.print("Enter the name: ");
        name=scanner.next();
    }

	
	public void Phone_no(){
		System.out.print("Enter phone number: ");
        phoneNo=scanner.nextLong();
    }

	
	public void Date_of_birth(){
		System.out.print("Enter the Date of birth: ");
		DOB=scanner.next();
	}
	
	public void Display(){
		System.out.println("Name = "+name);
		System.out.println("Phone no. = "+phoneNo);
		System.out.println("Date of birth = "+DOB);
	}
}