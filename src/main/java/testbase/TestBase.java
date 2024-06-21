package testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	@BeforeTest
	public void start() {
		logger = Logger.getLogger("FrameWork Started");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Frame Execution Started");
	}
	
	public void end() {
		
		logger.info("Framework Ended");
	}
	
	
	
	
	@BeforeMethod
	public void setup() {
		
	 String br = "Chrome";
		if(br.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
			
		}
		else if(br.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if(br.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		else {
			logger.info("Provide Correct Browser");
			
		}
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
