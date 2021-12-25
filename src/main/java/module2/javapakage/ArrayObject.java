package module2.javapakage;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayObject {
	public static void main(String[] args) {
		// Array object -- accepts any object / data.
		Object a[] = { 10, 20, 30, 40, "Name", 9749262962L };
		// Array List - object type of data declaration.
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("Uday");
		list.add(120);
		list.add(9946396364L);
		System.out.println(list);
     
		// Iterate 
		Iterator<Object> values = list.iterator();
		while (values.hasNext()) {
			System.out.println(values.next());
		}
	}
}
