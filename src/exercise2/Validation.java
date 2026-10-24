package exercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/forms");
	WebElement values=driver.findElement(By.xpath("//input[@value='Submit']"));
	boolean ValValues=values.isDisplayed();
	System.out.println(ValValues);
	driver.navigate().to("https://letcode.in/edit");
	WebElement Notdisplayed=driver.findElement(By.xpath("//input[@id='noEdit']"));
boolean Nd=	Notdisplayed.isEnabled();

System.out.println(Nd);
	}

}
