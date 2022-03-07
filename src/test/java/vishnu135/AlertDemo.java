package vishnu135;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String [] args) throws InterruptedException

	{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.tnstc.in/home.html");
	
	WebElement ab = driver.findElement(By.xpath("//a[@class='btnTxt']"));
	
	ab.click();
	
	Thread.sleep(3000);
	
	//driver.switchTo().alert().accept(); 
	
	// driver.switchTo().alert().dismiss();

	Alert alt = driver.switchTo().alert();
	
	System.out.println(alt.getText());
	
	alt.accept();
	
	}
}
