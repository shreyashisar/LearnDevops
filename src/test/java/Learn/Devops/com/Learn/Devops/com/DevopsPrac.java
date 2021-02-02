package Learn.Devops.com.Learn.Devops.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class DevopsPrac {
	String path = System.getProperty("user.dir");
	WebDriver driver;
	

	@Test
	public void openbrowser_chrome(){
				
		System.setProperty("webdriver.chrome.driver", path +"\\Server\\chromedriver.exe");
		System.out.println("The thread ID for chrome is "+ Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("http://www.javatpoint.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
	
	@Test
	public void openbrowser_edge(){
		
		System.setProperty("webdriver.edge.driver", path +"\\Server\\msedgedriver.exe");
		System.out.println("The thread ID for edge is "+ Thread.currentThread().getId());
		driver = new EdgeDriver();
		driver.get("http://www.javatpoint.com/");
		driver.manage().window().maximize();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		driver.quit();
		
//		try {
//		    Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
		  
		
	}
}
	
