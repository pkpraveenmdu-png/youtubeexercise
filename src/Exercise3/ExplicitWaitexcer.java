package Exercise3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitexcer {

	private static final String Expectedcondition = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://letcode.in/waits");
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
Alert alert=wait.until(ExpectedConditions.alertIsPresent());
System.out.println(alert.getText());
alert.accept();

	}

}
