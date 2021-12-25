/*
 * package module2.javapakage;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.edge.EdgeDriver;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class SwitchcaseEx {
 * 
 * public static void main(String[] args) { // define WebDriver driver; String
 * browser = "chrome";
 * 
 * switch (browser) { // nested if
 * 
 * case "chrome": System.out.println("Chrome browser");
 * WebDriverManager.chromedriver().setup(); // 5/0 driver = new ChromeDriver();
 * 
 * driver.get("https://www.facebook.com/");
 * 
 * break; // break statement / case
 * 
 * case "edge": System.out.println("Edge browser");
 * 
 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
 * driver.get("https://www.myntra.com/");
 * 
 * break;
 * 
 * case "firefox": System.out.println("Open firefox browser"); break;
 * 
 * default: System.out.println("browser is not valid"); }
 * 
 * }
 * 
 * }
 */