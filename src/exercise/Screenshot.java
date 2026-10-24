package exercise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/edit");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/test.png");
		FileHandler.copy(src, dest);
	WebElement ele=	driver.findElement(By.xpath("//h1[text()='Input']"));
	File Scr2=ele.getScreenshotAs(OutputType.FILE);
	File dest1= new File("./Screenshot/test1.png");
	FileHandler.copy(src, dest1);
	WebElement ele1=	driver.findElement(By.className("space-y-3"));
	File Scr3=ele1.getScreenshotAs(OutputType.FILE);
	File dest3=new File("./Screenshot/test2.png");

	FileHandler.copy(Scr3, dest3);
	}
}
