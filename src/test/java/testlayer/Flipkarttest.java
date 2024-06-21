package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pagelayer.CartPage;
import pagelayer.HomePage;
import pagelayer.MobilePage;
import testbase.TestBase;

public class Flipkarttest extends TestBase {

	@Test
	public  void TestAll() throws InterruptedException {
		
		
	
		
		HomePage homepage_0bj = new HomePage(driver);
		
		homepage_0bj.clickonmobilelink();
		
		
		MobilePage mobilepage_obj = new MobilePage(driver);
		
		
		mobilepage_obj.clickonrealmec51();
		
		mobilepage_obj.clickongotocartbutton(driver);
		
		CartPage cartpage_obj = new CartPage(driver);
	     
		Thread.sleep(5000);
		cartpage_obj.clickoncart();
		Thread.sleep(5000);
		cartpage_obj.clickonremovelink();
		Thread.sleep(5000);
		cartpage_obj.clickonremovebutton();
	}
	}
