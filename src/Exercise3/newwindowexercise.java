package Exercise3;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindowexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
String parent=driver.getWindowHandle();
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.instagram.com/?hl=en");
driver.manage().window().maximize();
String child=driver.getWindowHandle();
driver.switchTo().window(child);
//driver.switchTo().window(parent);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().window().maximize();



	}

}
