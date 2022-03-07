package vishnu135;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLanunch {

public static void chromeBrowser()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
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
	
	public static void EdgeLaunch()
	
	{
	
System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver(); 
		
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
	
	public static void FirefoxLaunch()
	
	{
	
System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		
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
	
	public static void main (String [] args)
	
	{
		
	
		FirefoxLaunch();
		
	}
	
}
