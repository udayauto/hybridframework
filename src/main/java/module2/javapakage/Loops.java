package module2.javapakage;
public class Loops {
	public static void main(String[] args) {
		// display 1 -10 numbers
		// display 100 names
		// for
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);

			if (i == 5) {
				break;
			}
		}
		// while

		while (i <= 10) {

			System.out.println(i);
			i++;
		}

	}

}
