package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_const1 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
		System.setProperty(gecko_key,gecko_value );
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get(base_url);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@AfterMethod
		
		public void closeApp(ITestResult res) throws IOException
		{
			if(ITestResult.FAILURE==res.getStatus())
			{
				Takescreenshot.getphoto(driver);
			}
			driver.close();	
		
	}
}


