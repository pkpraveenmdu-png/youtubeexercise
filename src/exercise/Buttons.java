package exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/button");
		driver.manage().window().maximize();
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		
		//driver.navigate().back();
	}

}
