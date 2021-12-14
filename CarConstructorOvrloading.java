package DiffConstructors;

public class CarConstructorOvrloading {
	
	//declaring of variables
	String clr;
	String model;
	int price;
	
	CarConstructorOvrloading(){
		//initializing of variable
		

		
	}
	CarConstructorOvrloading(String c,String m,int p) {
		
		this.clr =c;
		this.model =m;
		this.price =p;
		
	}
	CarConstructorOvrloading(int p) {
		this.price =p;
		
	}
	
	public static void main(String[]args) {
	
		CarConstructorOvrloading c =new CarConstructorOvrloading(600000);
		System.out.println( c.clr + " " +c.model + " " + c.price);
		
		CarConstructorOvrloading c1 =new CarConstructorOvrloading("grey", "I20",900000);
		System.out.println( c1.clr + " " +c1.model + " " + c1.price);
		
		
	}
	
	
	
			
	}


