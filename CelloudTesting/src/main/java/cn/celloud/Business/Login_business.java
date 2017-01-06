package cn.celloud.Business;

import org.openqa.selenium.WebDriver;

import cn.celloud.PageElement.Login_page;
import cn.celloud.config.GetTestProperties;



public class Login_business {
	private WebDriver driver;
	public Login_business(WebDriver driver){
		this.driver=driver;
	}
	
	public void GotoUrl(){
		driver.get(GetTestProperties.getTestUrl());
	}
	public void Login(String userName,String userPass){
		
		
		
		this.GotoUrl();
		
		Login_page login_page=new Login_page(driver);
		login_page.SetUsername(userName);
		login_page.SetPassword(userPass);
		login_page.Click_button();
		
		
		
		
		
		
		
		
		
	}

}

