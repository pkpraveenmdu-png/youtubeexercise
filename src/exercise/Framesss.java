package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesss {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://letcode.in/frame");
	driver.switchTo().frame(0);
	Thread.sleep(100);
	driver.findElement(By.name("fname")).sendKeys("Praveen");
	driver.findElement(By.name("lname")).sendKeys("Premkumar");
	driver.switchTo().frame(0);
	driver.findElement(By.name("email")).sendKeys("hjjjj@gmail.com");
	driver.switchTo().defaultContent();
}
}
