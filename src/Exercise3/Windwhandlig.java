package Exercise3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windwhandlig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://letcode.in/window");driver.manage().timeouts().getImplicitWaitTimeout();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
String address=driver.getWindowHandle();
System.out.println(address);
Set<String> alladdress=driver.getWindowHandles();
System.out.println(alladdress);

List<String> add= new ArrayList<String>(alladdress);
String childaddress=add.get(1);
driver.switchTo().window(childaddress);
System.out.println("Childadd is "+childaddress);
String Parentaddress=add.get(0);
driver.switchTo().window(Parentaddress);
System.out.println("Parentadd is "+Parentaddress);












	}

}
