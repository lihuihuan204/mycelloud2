package cn.celloud.Case;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import cn.celloud.Business.Login_business;

public class Celloud_case extends Test_Base {
	
	
	
	
  @Test
  public void login_case(Method method) throws InterruptedException {
	  
	  String methodName = "";
	  methodName = method.getName();
	  log.info(methodName + " is running !");
	  Login_business login_case=new Login_business(driver);
	  login_case.Login("xiawt", "celloud");
	  
	  Thread.sleep(1000);
	  Assert.assertTrue(driver.getTitle().contains("控制台"));
	  capture=false;
	  
	  
		  
	  
 
	 
  }
  
}
