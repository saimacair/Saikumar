package StaticClass;

public class StaticVariablesWithStaticMethod {
	
		
		
		
		//static variable can be accessed directly in static method
		
		static int variable;
		static String variable_one;
		
		//static method
		
		static void display() {
			System.out.println("integer variable : " + 44);
			System.out.println("variable_one :" + variable_one);
		
	}
		
		public static void main (String[]args) {
			
			
		//invoke the static method
			display();
		}

}
