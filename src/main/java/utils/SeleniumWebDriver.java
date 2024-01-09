package utils;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {

	private static SeleniumWebDriver seleniumDriver;
	private static WebDriver driver;
	
	private SeleniumWebDriver() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10000));
		 driver.manage().deleteAllCookies();
	}
	
	
	
	public static WebDriver getDriver() {
		 return driver ;
	}
	
    public static void setDriver() {
    	if (seleniumDriver== null) {
    		seleniumDriver = new SeleniumWebDriver();
    	}
		
	}
	
	public static void openPage(String Url) {
		driver.get(Url);
	}
	
	public static void tearDown() {
		if(driver != null) {
		//driver.quit();
		driver.close();
	}
		seleniumDriver =  null;
		}
	
	
	
	
}
