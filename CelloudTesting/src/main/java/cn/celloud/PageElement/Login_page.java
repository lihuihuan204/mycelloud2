package cn.celloud.PageElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	
	
	private WebDriver driver;
	
	public Login_page(WebDriver driver){
		this.driver=driver;
	}
	
	public void SetUsername(String userName){
		driver.findElement(By.className("username")).clear();
		driver.findElement(By.className("username")).sendKeys(userName);
		
	}

	public void SetPassword(String userPass){
		driver.findElement(By.className("pwd")).clear();
		driver.findElement(By.className("pwd")).sendKeys(userPass);
				
	}
	public void Click_button(){
		driver.findElement(By.className("btn-login")).click();
	}
}
