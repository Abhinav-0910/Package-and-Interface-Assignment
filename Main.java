import Details.*;
import Details2.*;
import java.util.Scanner;

public class Main{
	static Vegetables veg[]=new Vegetables[5];
	static Fruits fruit[]=new Fruits[5];
	static Packed_Goods packed_goods[]=new Packed_Goods[5];
	static Dairy_products dairy[]=new Dairy_products[5];
	static Employee employee[]=new Employee[5];
	static Customer customer[]=new Customer[5];
	static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
		while(true){
			System.out.println("\n------------------Grocery Shop Management System-------------------");
			System.out.println("1. Add Product\n");
			System.out.println("2. List Products\n");
			System.out.println("3. Remove Product\n");
			System.out.println("4. Add Employee\n");
			System.out.println("5. List Employees\n");
			System.out.println("6. Remove Employees\n");
			System.out.println("7. Add Customer\n");
			System.out.println("8. List Customers\n");
			System.out.println("9. Calculate Total Bill\n");
			System.out.println("10. Exit\n");
			System.out.print("Select an option: ");

			int choice=scanner.nextInt();
			scanner.nextLine();
			System.out.println("----------------------------------------\n");
			switch(choice){
				case 1:
					addproducts(veg, fruit, packed_goods, dairy);
					break;
					
				case 2:
					displayproducts(veg, fruit, packed_goods, dairy);
					break;
					
				case 3:
					removeProducts(veg, fruit, packed_goods, dairy);
					break;
					
				case 4:
					addemployee(employee);
					break;
					
				case 5:
					listemployee(employee);	
					break;
					
				case 6:
					removeEmployee(employee);
					break;
						
				case 7:
					addcustomer(customer);					
					break;
					
				case 8:
					listcustomer(customer);	
					break;
				
				case 9:
					System.out.println("Enter product type: ");
					System.out.println("1. Vegetables\n");
					System.out.println("2. Fruits\n");
					System.out.println("3. Packed goods\n");
					System.out.println("4. Dairy goods\n");
					System.out.println("5. Return to main menu\n");
					int productType=scanner.nextInt();
					System.out.print("Enter the quantity: ");
					int quantity=scanner.nextInt();
					System.out.print("Enter the index of product: ");
					int i=scanner.nextInt();
					if (productType==1 && veg[i] != null){
						double price=veg[i].Price;
						double totalCost = calculateTotalCost(price, quantity);
						veg[i].Quantity-=quantity;
						System.out.println("Total cost: Rs " + totalCost);
					} 
					else if (productType==2 && fruit[i] != null){
						double price = fruit[i].Price;
						double totalCost = calculateTotalCost(price, quantity);
						System.out.println("Total cost: Rs " + totalCost);
						fruit[i].Quantity-=quantity;
					}
					else if (productType==3 && packed_goods[i] != null){
						double price = packed_goods[i].Price;
						double totalCost = calculateTotalCost(price, quantity);
						System.out.println("Total cost: Rs " + totalCost);
						packed_goods[i].Quantity-=quantity;
					}
					else if (productType==4 && dairy[i] != null){
						double price = dairy[i].Price;
						double totalCost = calculateTotalCost(price, quantity);
						System.out.println("Total cost: Rs " + totalCost);
						dairy[i].Quantity-=quantity;
					}
					else{
						System.out.println("No products found for the selected type.");
					}
					break;
					
				case 10:
					System.out.println("Exiting the program.");
					scanner.close();
					System.exit(0);
					break;
						
				default:
					System.out.println("Invalid option. Please select a valid option.");
					System.out.print("\n");
					break;
			}
		}
	}
	
	static void addproducts(Vegetables veg[], Fruits fruit[], Packed_Goods packed_goods[], Dairy_products dairy[]){
		while(true){
			System.out.println("1. Vegetables\n");
			System.out.println("2. Fruits\n");
			System.out.println("3. Packed goods\n");
			System.out.println("4. Dairy goods\n");
			System.out.println("5. Return to main menu\n");
			System.out.print("Enter product type: ");
			int type=scanner.nextInt();
			System.out.print("\n");
			System.out.println("----------------------------------------\n");
			if(type==1){
				System.out.print("Number of products to be stored: ");
				int number=scanner.nextInt();
				if(veg[4]==null){
					for(int i=0;i<number;i++){
					veg[i]=new Vegetables();
					veg[i].Name();
					veg[i].Expiry_date();
					veg[i].Price();
					veg[i].Quantity();
					System.out.print("Product has been successfully added.\n");
					System.out.println("----------------------------------------\n");
					}
				}
				else{
					System.out.println("Cannot store more information.");
					System.out.println("----------------------------------------\n");
				}
			}
			
			else if(type==2){
				System.out.print("Number of products to be stored: ");
				int number=scanner.nextInt();
				if(fruit[4]==null){
					for(int i=0;i<number;i++){
					fruit[i]=new Fruits();
					fruit[i].Name();
					fruit[i].Expiry_date();
					fruit[i].Price();
					fruit[i].Quantity();
					System.out.print("Product has been successfully added.\n");
					System.out.println("----------------------------------------\n");
					}
				}
				else{
					System.out.println("Cannot store more information.");
					System.out.println("----------------------------------------\n");
				}
			}
			
			else if(type==3){
				System.out.print("Number of products to be stored: ");
				int number=scanner.nextInt();
				if(packed_goods[4]==null){
					for(int i=0;i<number;i++){
					packed_goods[i]=new Packed_Goods();
					packed_goods[i].Name();
					packed_goods[i].Expiry_date();
					packed_goods[i].Price();
					packed_goods[i].Quantity();
					System.out.print("Product has been successfully added.\n");
					System.out.println("----------------------------------------\n");
					}
				}
				else{
					System.out.println("Cannot store more information.");
					System.out.println("----------------------------------------\n");
				}
			}
			
			else if(type==4){
				System.out.print("Number of products to be stored: ");
				int number=scanner.nextInt();
				if(dairy[4]==null){
					for(int i=0;i<number;i++){
					dairy[i]=new Dairy_products();
					dairy[i].Name();
					dairy[i].Expiry_date();
					dairy[i].Price();
					dairy[i].Quantity();
					System.out.print("Product has been successfully added.\n");
					System.out.println("----------------------------------------\n");
					}
				}
				else{
					System.out.println("Cannot store more information.");
					System.out.println("----------------------------------------\n");
				}
			}
			
			else{
				System.out.println("Returning to main menu");
				System.out.println("****************************************\n");
				break;
			}
		}
	}

	static void displayproducts(Vegetables veg[], Fruits fruit[], Packed_Goods packed_goods[], Dairy_products dairy[]){
		while(true){
			
			System.out.println("1. Vegetables\n");
			System.out.println("2. Fruits\n");
			System.out.println("3. Packed goods\n");
			System.out.println("4. Dairy goods\n");
			System.out.println("5. Return to main menu\n");
			System.out.println("Enter product type: ");
			int type=scanner.nextInt();
			System.out.println("----------------------------------------\n");
			if(type==1){
				System.out.println("---------------Vegetables---------------\n");
				for(int i=0;i<veg.length;i++){
					if(veg[i]!=null){
						veg[i].Display();
						System.out.print("\n");
					}
					else{
						break;
					}
				}
				System.out.println("----------------------------------------\n");
			}
			
			else if(type==2){
				System.out.println("---------------Fruits---------------\n");
				for(int i=0;i<fruit.length;i++){
					if(fruit[i]!=null){
						fruit[i].Display();
						System.out.print("\n");
					}
					else{
						break;
					}
				}
				System.out.println("----------------------------------------\n");
			}
			
			else if(type==3){
				System.out.println("---------------Packed Goods---------------\n");
				for(int i=0;i<packed_goods.length;i++){
					if(packed_goods[i]!=null){
						packed_goods[i].Display();
						System.out.print("\n");
					}
					else{
						break;
					}
				}
				System.out.println("----------------------------------------\n");
			}
			
			else if(type==4){
				System.out.println("---------------Dairy Products---------------n");
				for(int i=0;i<dairy.length;i++){
					if(dairy[i]!=null){
						dairy[i].Display();
						System.out.print("\n");
					}
					else{
						break;
					}	
				}
				System.out.println("----------------------------------------\n");
			}
			
			else{
				System.out.println("Returning to main menu");
				System.out.println("******************************************************\n");
				break;
			}
		}
	}

	static void addemployee(Employee employee[]){
		System.out.print("Enter number of employees whose details need to be stored: ");
		int number=scanner.nextInt();
		if(employee[4]==null){
			for(int i=0;i<number;i++){
			employee[i]=new Employee();
			employee[i].Name();
			employee[i].Phone_no();
			employee[i].Date_of_birth();
			employee[i].Status();
			System.out.print("Employee details has been successfully added.\n");
			System.out.println("******************************************************\n");
			}
		}
		else{
			System.out.println("Cannot store more information.");
			System.out.println("----------------------------------------\n");
		}
	}

	static void listemployee(Employee employee[]){
		System.out.println("---------------Employees---------------\n");
		for(int i=0;i<employee.length;i++){
			if(employee[i]!=null){
				employee[i].Display();
				System.out.print("\n");
			}
			else{
				break;				
			}
		}
		System.out.println("******************************************************\n");
	}

	static void addcustomer(Customer customer[]){
		System.out.print("Enter number of customers whose details need to be stored: ");
		int number=scanner.nextInt();
		if(customer[4]==null){
			for(int i=0;i<number;i++){
			customer[i]=new Customer();
			customer[i].Name();
			customer[i].Phone_no();
			customer[i].Date_of_birth();
			System.out.print("Customer details has been successfully added.\n");
			System.out.println("******************************************************\n");
			}
		}
		else{
			System.out.println("Cannot store more information.");
			System.out.println("----------------------------------------\n");
		}
	}

	static void listcustomer(Customer customer[]){
		System.out.println("---------------Customers---------------\n");
		for(int i=0;i<customer.length;i++){
			if(customer[i]!=null){
				customer[i].Display();
				System.out.print("\n");
			}
			else{
				break;
			}
		}
		System.out.println("******************************************************\n");
	}

	static void removeProducts(Vegetables veg[], Fruits fruit[], Packed_Goods packed_goods[], Dairy_products dairy[]) {
		while(true){
			System.out.println("1. Vegetables\n");
			System.out.println("2. Fruits\n");
			System.out.println("3. Packed goods\n");
			System.out.println("4. Dairy goods\n");
			System.out.println("5. Return to the main menu\n");
			System.out.println("Enter product type: ");
			int type=scanner.nextInt();
			System.out.println("----------------------------------------\n");
			scanner.nextLine();

			if(type==1){
				System.out.print("Enter the index of the vegetable to remove: ");
				int index = scanner.nextInt();
				if(index>=0&&index<veg.length) {
					veg[index]=null;
					System.out.println("Vegetable removed.\n");
				} 
				else{
					System.out.println("Invalid index.\n");
				}
				System.out.println("----------------------------------------\n");
			}
			
			else if(type==2){
				System.out.print("Enter the index of the fruit to remove: ");
				int index=scanner.nextInt();
				if(index>=0&&index<fruit.length) {
					fruit[index]=null;
					System.out.println("fruit removed.\n");
				} 
				else{
					System.out.println("Invalid index.\n");
				}
				System.out.println("----------------------------------------\n");
			} 
			
			else if(type==3){
				System.out.print("Enter the index of the packed good to remove: ");
				int index=scanner.nextInt();
				if(index>=0&&index<packed_goods.length) {
					packed_goods[index]=null;
					System.out.println("packed good removed.\n");
				} 
				else{
					System.out.println("Invalid index.\n");
				}
				System.out.println("----------------------------------------\n");
			}
			
			else if(type==4) {
				System.out.print("Enter the index of the dairy product to remove: ");
				int index=scanner.nextInt();
				if(index>=0&&index<dairy.length){
					dairy[index]=null;
					System.out.println("dairy product removed.\n");
				} 
				else{
					System.out.println("Invalid index.\n");
				}
				System.out.println("----------------------------------------\n");
			} 
			
			else{
				System.out.println("Returning to main menu...");
				System.out.println("******************************************************\n");
				break;
			}
		}
	}

	static void removeEmployee(Employee employee[]){
		System.out.print("Enter the index of the employee to remove: ");
		int index=scanner.nextInt();
		if(index>=0&&index<employee.length) {
			employee[index]=null;
			System.out.println("Employee removed.\n");
		} 
		else{
			System.out.println("Invalid index.\n");
		}
		System.out.println("******************************************************\n");
	}
	
	static double calculateTotalCost(double price, int quantity){
		return price*quantity;
	}
}
	