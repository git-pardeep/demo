package demotestcom.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class Google extends BaseClass{
	@BeforeMethod
	public void setUp() {
		launchBrowser();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void test() throws InterruptedException {
		launchURL();
	}
	
}
