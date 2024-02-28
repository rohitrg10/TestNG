package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnerClass.class)
public class InvokeEdge {
	
	
	@Test
	public void invokeedge() {
		
		System.setProperty("webdriver.msedge.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\edgedriver_win64/msedgedriver.exe");
	
				WebDriver driver = new EdgeDriver();
				
				driver.get("https://www.selenium.dev/");
				
	}

}
