package pagelayer;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class MobilePage extends TestBase  {

	
	public MobilePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[text()=\"realme C51 (Mint Green, 64 GB)\"]")
	private WebElement realmec51_link;
	
	
	private By Addtocar_button = By.xpath("//button[text()=\"Add to cart\"]");
	
	
	
	public void clickonrealmec51() {
		
		realmec51_link.click();
		
	}
	
	public void clickongotocartbutton(WebDriver driver) throws InterruptedException {
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>   ids   =  new ArrayList(allids);
	    driver.switchTo().window(ids.get(1));
		driver.findElement(Addtocar_button).click();
		Thread.sleep(5000);
	
		driver.navigate().back();
	}
	}
