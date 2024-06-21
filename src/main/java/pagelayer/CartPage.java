package pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.TestBase;

public class CartPage extends TestBase {

	public CartPage(WebDriver driver) {
		
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]/span[1]")
	private WebElement cart_button;
	
	@FindBy(xpath="//div[text()=\"Remove\"]")
	private WebElement remove_link;
	
	@FindBy(xpath="//div[text()=\"Remove\"]")
	private WebElement remove_button;
	
	public void clickoncart() {
		CartPage o = new CartPage(driver);
		o.waitforclickaction(cart_button).click();
		//cart_button.click();
	
	}
	public void clickonremovelink() {
		
		remove_link.click();
		
		}
	
	public void clickonremovebutton() {
		
		remove_button.click();
		
		
	}
	public WebElement waitforclickaction(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
}
