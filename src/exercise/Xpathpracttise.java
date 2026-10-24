package exercise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpracttise {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://letcode.in/edit");
	driver.findElement(By.id("fullName")).sendKeys(" Praveen");
	driver.findElement(By.xpath("//input[@id='join']")).sendKeys("Person");
	String attributeval=driver.findElement(By.id("getMe")).getAttribute("value");
	System.out.println(attributeval);
	driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
	Boolean enable=driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
	System.out.println(enable);
	String confirmText=driver.findElement(By.xpath("//input[@id='dontwrite']")).getAttribute("readonly");
	System.out.println(confirmText);
//driver.close();
	
}
}
