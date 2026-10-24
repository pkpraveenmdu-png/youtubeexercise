package Exercise3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Additems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Additems.cart(driver);////img[@alt='Cart']

driver.findElement(By.xpath("//img[@alt='Cart']")).click();
driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//input[@class='promoCode']
wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//input[@class='promoCode']"))).sendKeys("rahulshettyacademy");
//driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
driver.findElement(By.xpath("//button[text()='Apply']")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Place Order']"))).click();




	}
	private static WebDriverWait WebDriverWait(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}
	public static  void cart(WebDriver driver) {
		String[] expectedprod= {"Cucumber","Potato","Pomegranate"};
		List<WebElement> prodnames=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<prodnames.size();i++) {
		String[]names=prodnames.get(i).getText().split("-");
		String editedname=names[0].trim();
		List Actualprod= Arrays.asList(expectedprod);
		if(Actualprod.contains(editedname)) {
			driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
		}
		}
	}
}
