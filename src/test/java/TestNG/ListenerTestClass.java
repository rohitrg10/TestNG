package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(ListnerClass.class)
public class ListenerTestClass {
	
	@Test
	public void invokechrome() {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		
		
		
		
		
	}
	
	
	

}
