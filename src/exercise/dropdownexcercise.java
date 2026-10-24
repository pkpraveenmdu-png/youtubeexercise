package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownexcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://letcode.in/dropdowns");
WebElement ele=driver.findElement(By.xpath("//select[@id='fruits']"));
Select ops= new Select(ele);
ops.selectByIndex(3);
WebElement ele1 = driver.findElement(By.id("superheros"));
Select ops2= new Select(ele1);
boolean ismultiple=ops2.isMultiple();
System.out.println("ismultiple is "+ismultiple );
ops2.selectByValue("am");
ops2.selectByValue("aq");
ops2.selectByValue("ta");
List<WebElement> allMutipleops=ops2.getAllSelectedOptions();
for(WebElement allMutipleops1: allMutipleops) {
	System.out.println(allMutipleops1.getText());
}

WebElement ele3=driver.findElement(By.xpath("//select[@id='lang']"));
Select ops3= new Select(ele3);
ops3.selectByIndex(1);
WebElement nam=ops3.getFirstSelectedOption();
//nam.getText();
System.out.println("Selected name is "+nam.getText());

WebElement ele4= driver.findElement(By.xpath("//select[@id='country']"));
Select ops4= new Select(ele4);
WebElement Sop=ops4.getFirstSelectedOption();
System.out.println(Sop.getText());
	}

}
