package Details;
import java.util.Scanner;

interface Item_details{
    void Name();
    void Expiry_date();
    void Quantity();
    void Price();
	void Display();
}

public class Packed_Goods implements Item_details{
	Scanner scanner=new Scanner(System.in);
	public String name, date;
	public int Price, Quantity;
	
    public void Name(){
		System.out.print("Enter name of product: ");
        name=scanner.next();
    }
	
	public void Expiry_date(){
		System.out.print("Enter the date of expiry: ");
		date=scanner.next();
	}
	
	public void Price(){
		System.out.print("Enter the price: ");
		Price=scanner.nextInt();
	}
	
	public void Quantity(){
		System.out.print("Enter the quantity: ");
		Quantity=scanner.nextInt();
	}
	
	public void Display(){
		System.out.println("Name = "+name);
		System.out.println("Price = "+Price);
		System.out.println("Date of expiry = "+date);
		System.out.println("Quantity available = "+Quantity);
	}
}



