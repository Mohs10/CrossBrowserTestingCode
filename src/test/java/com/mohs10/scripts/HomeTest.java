package com.mohs10.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.getData.getdata;
import com.mohs10.or.HomePage;
import com.mohs10.reuse.CommonFuns;



public class HomeTest extends StartBrowser {
	
	@Test 
	@Parameters({"browser", "name", "email", "sub", "msg"})
	public void firefox(@Optional("firefox") String browser, String name, String email, String sub, String msg) throws Exception {
	  WebDriver driver = StartBrowser.beforeClass(browser, "https://krisemidesigntech.com/about.html");
	  CommonFuns coms = new CommonFuns();
	  System.out.println("Firefox browser open");

	  coms.CommonsFun(name, email, sub, msg);// test data should be given in .xml file
	  System.out.println("FireFox closed");

	  Thread.sleep(2000); 
	  driver.close();
	}

	//provide @optional annotation to browser name	
	@Test
	@Parameters({"browser", "name", "email", "sub", "msg"})
	public void chrome(@Optional("chrome") String browser, String name, String email, String sub, String msg) throws Exception {
	  WebDriver driver = StartBrowser.beforeClass(browser, "https://krisemidesigntech.com/about.html");
	  CommonFuns coms = new CommonFuns();
      System.out.println("chrome browser opened");
	  coms.CommonsFun(name, email, sub, msg);
	  System.out.println("chrome browser closed");
	  Thread.sleep(2000); 
	  driver.close();
	}
	//change only @ optional referece
	@Test
	@Parameters({"browser", "name", "email", "sub", "msg"})
	public void edge(@Optional("edge") String browser, String name, String email, String sub, String msg) throws Exception {
	  WebDriver driver = StartBrowser.beforeClass(browser, "https://krisemidesigntech.com/about.html");
	  CommonFuns coms = new CommonFuns();
	  System.out.println("edge browser opened");
	  coms.CommonsFun(name, email, sub, msg);
	  System.out.println("edge browser closed");
	  Thread.sleep(2000); 
	  driver.close();
	}
}