package exercise2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElements1 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
WebElement actele=	driver.switchTo().activeElement();
actele.sendKeys("Email",Keys.TAB,"passwod",Keys.ENTER);
	
}
}
