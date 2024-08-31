package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
     
     
	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement Search;
	
	@FindBy(xpath="//p[text()='kurti']") private WebElement kurti ;
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void search (){
		Search.click();
	}
	public void kurti() {
		kurti.click();
	}
	
}
