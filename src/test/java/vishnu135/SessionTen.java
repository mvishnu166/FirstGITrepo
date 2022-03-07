package vishnu135;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionTen {
	
	public static void main(String [] args) throws InterruptedException

	{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	
	WebElement BSD = driver.findElement(By.id("menu1"));

	BSD.click();
	
	List <WebElement> xp = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']//li/a"));
	
	for (WebElement e : xp)
		
	{
		
		System.out.println(e.getText());
		
		if (e.getText().contentEquals("JavaScript"))

		{
			e.click();
			break;
		}
			
	}
	
	/*for (int i =0; i<xp.size(); i++)
		
	{
		
		String s= xp.get(i).getText();
		
		System.out.println(s);
		
		if (s.contentEquals("JavaScript"))
			
		{
			xp.get(i).click();
			Thread.sleep(3000);
		break;
		}
		*/
		
	}
	
	}

