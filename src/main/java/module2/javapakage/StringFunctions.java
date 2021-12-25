package module2.javapakage;

public class StringFunctions {
	
	public static void main(String[] args) {
		
		String name = "Java Selenium";
		String company = "CTS";
		
		// Question --- company names - CTS, TCS, CompuCom, Wipro, Cargo
	
		// length
		int count = name.length();
		System.out.println("count is : " + count);
		
		//UpperCase
		System.out.println(name.toUpperCase());
		
		// lowerCase
		System.out.println(name.toLowerCase());
		//startsWith
		System.out.println(company.startsWith("C"));
		
		//substring -- extract portion of string -sub
		System.out.println(name.substring(5));
		System.out.println(name.substring(0));
		System.out.println(name.substring(0,4));

		// concat -- combine 2 values
		System.out.println(company+name);
		System.out.println(company.concat(name));
		
		String expectedTitle = "Google";
		String actualTitle = "google";

		// equals
		System.out.println(actualTitle.equals(expectedTitle)); // exact match
		//equalsIgnoreCase
		System.out.println(actualTitle.equalsIgnoreCase(expectedTitle));//Ignore case
		
		// charAt(index)
		System.out.println(expectedTitle.charAt(0));
		
		//contains 
		
		String value = "Selenium - Google Search";
		System.out.println(value.contains("Google"));
	
		// validate the content
		String url = "https://citibank.com";
		if(url.contains("citibank.com")){
			System.out.println("Pass -- Url contains citibank.com");
		}else {
			
			System.out.println("Fail -- url doesn't macth -No citibank");
		}
		
	}

}
