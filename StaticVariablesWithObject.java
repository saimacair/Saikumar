package StaticClass;

public class StaticVariablesWithObject {
	
	//static variable can be share among al instances
	//static intiger variable
	
	static int var_num=71;
	
	//non-static string variable
	
	String name;
	
	public static void main(String[]args) {
		
		
	//we have to create an obj foe non static v variable
		//for static variabe we need not ro create an obj they can be acessed directly
		
		StaticVariablesWithObject object = new StaticVariablesWithObject();
		StaticVariablesWithObject Object1 = new StaticVariablesWithObject();
		
		//Assigning the values to the static variables
		
		object.name=" hi i am static variable";
	    object.var_num=200;
		
		
		Object1.name= "hi i am non static variable";
		Object1.var_num=400;
		
		System.out.println("object one : 'object ' "+ object.name);
		System.out.println("object one : 'object ' "+ object.var_num);
		
		System.out.println("Object one : 'Object ' "+ Object1.name);
		System.out.println("Object one : 'Object ' "+ Object1.var_num);
		
		
		
		

		
	}
}
