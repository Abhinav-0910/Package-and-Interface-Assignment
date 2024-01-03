package Details2;
import Details.Packed_Goods;
import java.util.Scanner;

public class Dairy_products extends Packed_Goods{
	Scanner scanner=new Scanner(System.in);
	public String name, day;
	public int Price, Quantity;
	
    public void Name(){
		System.out.print("Enter name of product: ");
        name=scanner.next();
    }
	
	public void Expiry_date(){
		System.out.print("Enter the days until expiry: ");
		day=scanner.next();
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
		System.out.println("Days until expiry = "+day);
		System.out.println("Quantity available = "+Quantity);
	}
}