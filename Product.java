package DiffConstructors;

public class Product {
	
	String model;
	int qty;
	int price;
	
	Product(){
		
		model="bmw";
		qty = 20;
		price=40000000;
	
			
		
	}
	
	public static void main(String[]args) {
		
		Product p1 = new Product();
		
		System.out.println("model "  +  p1.model );  
		System.out.println("qty "  +  p1.qty );  
		System.out.println("price "  +  p1.price );  
	}

}
