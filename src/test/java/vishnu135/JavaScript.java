package vishnu135;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String [] args) throws InterruptedException

	{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	/*
	driver.get("https://www.google.com");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement Ele = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[1]"));
	
	WebElement Ele1 = driver.findElement(By.name("q"));
	
	WebElement Ele2 = driver.findElement(By.linkText("Gmail"));
	
	String bgc = Ele.getCssValue("font-size"); //get styles
	
	System.out.println(bgc);*/
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	
	/*j.executeScript("arguments[0].style.border = '3px solid red'", Ele); //add border
	
	j.executeScript("arguments[0].style.backgroundColor = 'rgb(255,255,0)'", Ele2); //change background color
	
	j.executeScript("arguments[0].click()", Ele2);
	
	//scroll up/down using JS
	
	j.executeScript("window.scrollBy(0,3000)");
	
	Thread.sleep(5000);
	
	j.executeScript("window.scrollBy(0,-3000)");
	
	Thread.sleep(5000);

	j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	Thread.sleep(5000);

	j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	//Refresh using JS
	
	Thread.sleep(3000);
	
	j.executeScript("history.go(0)");
	
	//Sendkeys using JS
	
	j.executeScript("document.getElementsByName('q')[0].value ='TCE'");
	
	*/
	
	//go to url
	
	j.executeScript("window.location = 'https://www.google.com/'");
	
	//WebElement ele4 = driver.findElement(By.name("q"));
	
	//ele4.sendKeys("Elon musk" + Keys.ENTER);
	
	//WebElement ele3 = driver.findElement(By.xpath("//h3[text()='Elon Musk | Tesla']"));
	
	//Thread.sleep(3000);
	
	//j.executeScript("arguments[0].scrollIntoView(true)", ele3);
	
	String title = j.executeScript("return document.title").toString();
	
	System.out.println(title);
	
	String url = j.executeScript("return document.URL").toString();
	
	System.out.println(url);
	
	j.executeScript("alert('Hi..Vishnu')");
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	
	}
	
}
