package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//open the Browser
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
	WebElement draggable=	driver.findElement(By.id("draggable"));
	WebElement Droppable= driver.findElement(By.id("droppable"));
		Actions build= new Actions(driver);
		build.dragAndDrop(draggable, Droppable).build().perform();
		
		
	}
}
