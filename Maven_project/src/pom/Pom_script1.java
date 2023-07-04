package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demo.BasePage;



public class Pom_script1 extends BasePage{
	@FindBy(name="email")
	private WebElement uName;
	@FindBy(name="pass")
	private WebElement pWord;
	@FindBy(name="login")
	private WebElement loginBtn;
	

	public Pom_script1(WebDriver driver)
	{
		super(driver);
		
	}
	public void uName(String un)
	{
		uName.sendKeys(un);
	}
	public void pWord(String pwd)
	{
		uName.sendKeys(pwd);
	}
	public void btn()
	{
		loginBtn.click();
	}
}
