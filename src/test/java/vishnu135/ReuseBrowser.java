package vishnu135;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseBrowser {
	
	static WebDriver driver;
	
	public static void BrowserFactory(String browsername)
	
	{

	
	String browser = browsername.toUpperCase();
		
		switch (browser)
		
		{
			
		case "CHROME":
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		case "FIREFOX":
			
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "EDGE":
			
			System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		default:
			
			System.out.println(browser + "is not matched");
		
		}
		
	driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		
		if (title.equals("Google"))
		{
			System.out.println("Verified");
		}
		else 
		{
			System.out.println("Title is wrong");
		}
		
		String currenturl = driver.getCurrentUrl();
		
		if (currenturl.equals("https://www.google.co.in/"))
		{
			System.out.println("Url is verified");
		}
		else 
		{
			System.out.println("Not verified");
		}
		
		driver.manage().window().maximize();
		
	}

	public static void main(String [] args )
	{
		
		BrowserFactory("firefox");
		
	}
	
}
