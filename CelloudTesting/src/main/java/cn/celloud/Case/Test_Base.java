package cn.celloud.Case;

import cn.celloud.config.DriverManage;
import cn.celloud.util.RobotScreenShot;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import cn.celloud.util.CommonMethord;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;


public abstract class Test_Base {
	protected WebDriver driver = null;
	protected String browser;
	protected boolean capture;
	protected final Logger log = Logger.getLogger(getClass());

	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		capture = true;

		driver=DriverManage.getDriver(browser);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@BeforeTest
	public void beforeTest() throws Exception {
		PropertyConfigurator.configure(CommonMethord.getRealath()
				+ "config/log4j.properties");
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		try{
			
			if (capture){
				
				RobotScreenShot rss=new RobotScreenShot();
				rss.snapShot();
				
			}
			
		}catch(Exception e)
		{e.printStackTrace();}
		finally{
			if (driver!=null){
				CommonMethord.killProcess(getBrowserProcess(browser));
								
			}
				
		}
	}
	

	@Parameters({ "driverType" })
	@BeforeClass
	public void beforeClass(@Optional("2") String driverType) throws Exception {
		//capture=true;
		browser = driverType;
		
		
	}
		

	
		
		

	@AfterClass
	public void afterClass() {
	}

	public String getBrowserProcess(String bs){
		
		String process=null;
		switch (Integer.parseInt(bs)){
		case 1: 
			process="firefox.exe";
			break;
		case 2:
			process="iexplore.exe";
			break;
		case 3:
			process="chrome.exe";
			break;
			
		}
		return process;
		
		
		
		
	}
}
