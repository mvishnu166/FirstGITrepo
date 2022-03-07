package vishnu135;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

		public static void main(String[] args) throws InterruptedException, IOException {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			
			driver.manage().window().maximize();
			
			TakesScreenshot tks = (TakesScreenshot) driver;
			
			File temp = tks.getScreenshotAs(OutputType.FILE);
			
			File perm = new File("./SS/googlelogin.png");
			
			FileUtils.copyFile(temp, perm);
			
		}
			
}
