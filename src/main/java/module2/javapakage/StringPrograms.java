package module2.javapakage;

public class StringPrograms {

	public static void main(String[] args) {

		// Find out company names starts with C letter
		String companyNames[] = { "CTS", "TCS", "CompuCom", "Wipro", "Cargo" };
		int count = companyNames.length;

		System.out.println("count is: " + count);

		for (int i = 0; i < count; i++) {

			// one way
			/*
			 * if (companyNames[i].startsWith("C")) {
			 * 
			 * System.out.println(companyNames[i]); }
			 */
			
			//second way
			/*
			 * if (companyNames[i].charAt(0)=='C') {
			 * 
			 * System.out.println(companyNames[i]); }
			 */
			// contains
			
			if (companyNames[i].contains("C")) {

				System.out.println(companyNames[i]);
			}
		}
	}

	// String functions and programs
}
