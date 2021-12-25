package module2.javapakage;

public class Methods {
	
	// data types
	int a = 20;
    int b = 10;
	int c;
	
	// method  --> For re-usability
	
	// Login ---
	
	public void add(int a, int b){
		// set of statements (block of statems)
		c = a+b;
		System.out.println("sum of two values is : " + c);
			
	  }
	
	public void sub(int a, int b){
		// set of statements (block of statems)
		c = a-b;
		System.out.println("sum of two values is : " + c);
			
	  }

	public static void main(String[] args) {
		// object --
		
		Methods obj = new Methods();
		
		/*
		 * obj.a=100; obj.b=200;
		 */
		
		obj.add(400, 500);
		obj.sub(600, 500);
		
		
	}
	
}
