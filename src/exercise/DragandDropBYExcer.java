package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropBYExcer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://jqueryui.com/draggable/");
driver.switchTo().frame(0);
WebElement dargable= driver.findElement(By.id("draggable"));
Actions build= new Actions(driver);
build.dragAndDropBy(dargable, 30,50).build().perform();
//build.contextClick(target).perform();
	}

}
