package exercise2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebbokScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
File src1= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File dest1= new File("./Screenshot2/fb.png");
FileHandler.copy(src1, dest1);
//driver.close();

	}

}
