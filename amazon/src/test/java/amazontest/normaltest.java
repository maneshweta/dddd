package amazontest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import amazon.login;



public class normaltest {
public static void main(String[]args)  {


System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\important\\chromedriver.exe");
	
//	ChromeOptions options=new ChromeOptions();
	
 //     options.addArguments("--remote-allow-origins=*");
	
		
		WebDriver driver=new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.meesho.com");
	
	driver.manage().window().maximize();
	
	login in=new login(driver);
	
	in.search();
	in.kurti();
	
	
//	driver.close();
}
}
