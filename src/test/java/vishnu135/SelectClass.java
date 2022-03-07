package vishnu135;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Thread.sleep(3000);
		
		WebElement ab = driver.findElement(By.xpath("//select[@id='first']"));
		
		List<WebElement> listdd = driver.findElements(By.xpath("//select[@id='first']//option"));
		
		for (int i=0 ; i<listdd.size(); i++)
			
		{
			
			System.out.println(listdd.get(i).getText());
			
		}
		
		Select select = new Select(ab);
		
		select.selectByIndex(2);
		
		Thread.sleep(3000);
		
		select.selectByVisibleText("Yahoo");
		
		Thread.sleep(3000);
		
		select.selectByValue("Apple");
		
}
	
}
