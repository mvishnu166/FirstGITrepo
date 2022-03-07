package vishnu135;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionNine {
	
	public static void main(String [] args) throws InterruptedException

	{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	
	WebElement SN = driver.findElement(By.name("selenium_commands"));
	
	Select s = new Select (SN);
	
	s.selectByIndex(2);
	
	s.selectByVisibleText("WebElement Commands");
	
	//List<WebElement> all = s.getAllSelectedOptions();
	
	List<WebElement> o = s.getOptions();

	for (int i=0; i<o.size();i++)
	{
		System.out.println(o.get(i).getText());
	}
	
	WebElement F = s.getFirstSelectedOption();
	
	System.out.println(F.getText());
	
	System.out.println(s.isMultiple());
	
	Thread.sleep(3000);
	
	s.deselectByIndex(2);
	
	Thread.sleep(3000);
	
	s.deselectByVisibleText("WebElement Commands");
	
	}
	
}
