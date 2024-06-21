package pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//span[text()=\"Mobiles\"]")
	private WebElement mobiles_link;
	

	
	public void clickonmobilelink() {
		
		mobiles_link.click();
	}
	
}
