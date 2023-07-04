package runner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demo.Base_test;
import pom.Pom_script1;



public class Runnerclass extends Base_test{
	@Test(dataProvider ="testData")
	public void test1(String d1,String d2) throws InterruptedException
	{
		Pom_script1 p=new Pom_script1(driver);
		p.uName(d1);
		p.pWord(d2);
		Thread.sleep(2000);
		p.btn();
		Assert.fail();
	}
	@DataProvider(name="testData")
	public Object[][] createData()
	{
		return new Object[][]
				{
			{"Cedric", "admin"},
			{"Anne","manager"},
				};
	
				}
	}


