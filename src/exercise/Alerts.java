package exercise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		driver.manage().window().maximize();
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		driver.switchTo().alert().sendKeys("Praveen");
		driver.switchTo().alert().accept();

	//	System.out.println(text);
	}



}
