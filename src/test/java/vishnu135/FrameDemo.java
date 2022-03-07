package vishnu135;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String [] args) throws InterruptedException

	{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.switchTo().frame("login_page");
	
	driver.findElement(By.name("fldLoginUserId")).sendKeys("6554836583"); */
	
	driver.get("https://chercher.tech/practice/frames");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String text = driver.findElement(By.xpath("//span[text() = 'Not a Friendly Topic']")).getText();
	
	
	//driver.switchTo().frame("frame1");
	
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys(text);
	
	
	driver.switchTo().frame("frame3");
	
	
	WebElement ele2 = driver.findElement(By.xpath("//input[@id='a']"));
	
	
	ele2.click();
	
	//driver.switchTo().parentFrame();
	
//	driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("ENDING NOW");
	
	driver.switchTo().defaultContent();
	
	
	
	
	
	
	//WebElement ele = driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input"));
	
	//driver.switchTo().frame(ele);
	
	//ele.sendKeys(text);
	
	
}




	
	}
	

