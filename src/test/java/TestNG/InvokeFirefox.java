package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnerClass.class)
public class InvokeFirefox {
	
	
	@Test
	public void invokeff() {
	
	
	System.setProperty("webdriver.Gecko.driver",
			"C:\\Users\\rohit\\OneDrive\\Documents\\geckodriver-v0.34.0-win64/msedgedriver.exe");
	
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.selenium.dev/");
			
	}
			
			
			

}
