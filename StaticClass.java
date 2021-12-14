package StaticClass;

public class StaticClass {
	
	//static class can be made using static key word
	//static class cannot be non static members
	
	//static class
	
	static String str ="Sai";
	
	static class Nestedclass{
		
		//non static method
		
		public void display() {
			System.out.println(str);
			
			
		}
		
	}
	
	public static void main(String[]args) {
		
		StaticClass.Nestedclass object = new StaticClass.Nestedclass();
		object.display();
	}
	

}
