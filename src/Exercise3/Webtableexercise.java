package Exercise3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/table");driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	List<WebElement> ele1=	driver.findElements(By.xpath("//table[@id='shopping']//th"));
	for(WebElement Headers:ele1) {
		System.out.println(Headers.getText());	
	}
		List<WebElement> ele2=	driver.findElements(By.xpath("//table[@id='shopping']//tr"));
		for(WebElement Rows:ele2) {
			System.out.println(Rows.getText());
	}
			
	

	
	}
	
	}


