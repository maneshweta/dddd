package amazontest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import amazon.login;

public class validationtest {
	
	WebDriver driver;
	login in;
	


	@BeforeClass
	public void beforeclass() {
	
		
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	
      options.addArguments("--remote-allow-origins=*");

		 driver=new ChromeDriver(options);
	//driver=new FirefoxDriver();
	
	driver.get("https://www.meesho.com");
	
	driver.manage().window().maximize();
	
	}
	
	@Test
	public void To() {
	
		 L=new login(driver);
		
		L.search();
		L.kurti();
		
	}
	
	@AfterClass
	public void afterclass() {
//	driver.close();
	}
}
