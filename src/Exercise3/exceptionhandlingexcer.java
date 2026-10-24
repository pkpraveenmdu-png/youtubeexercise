package Exercise3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceptionhandlingexcer {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		try {
		    driver.get("https://letcode.i");
		    // test steps
		} catch (Exception e) {
		    System.out.println("Error vandhuchu");
		} 
	}
	}
			
	
