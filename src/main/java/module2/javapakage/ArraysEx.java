package module2.javapakage;

public class ArraysEx {
	
	public static void main(String[] args) {
	// Array -- mutliple values 
	
	int a[] = {10, 20, 30, 40, 50}; // 5 values (n-1) = 4
	
	int count = a.length;
	int i;
	
	System.out.println("array count is: " + count);
	
	for (i = 0; i <count; i++) { // index starts from 0
		System.out.println(a[i]);
	}
	}
}

// collection