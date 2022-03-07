package vishnu135;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionEight {
	
	public static void main (String [] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
	    WebElement Lt = driver.findElement(By.linkText("Gmail"));
	    
	    String Innertext = Lt.getText();
	    
	    System.out.println(Innertext);
		
		WebElement Lt1 = driver.findElement(By.name("q"));
		
		Lt1.sendKeys("Flipkart");
		
		System.out.println((Lt1.getAttribute("value")));
		
		System.out.println(Lt1.getAttribute("className"));
		
		//WebElement tb = driver.findElement(By.id("SIvCob"));
		
		//List<WebElement> lwe= tb.findElements(By.tagName("a"));
		
		//for (int i=0; i<lwe.size();i++) 
			
		//{
			
			//System.out.println(lwe.get(i).getText());
			
		//}
		
	}

}
