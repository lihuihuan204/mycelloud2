package cn.celloud.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import cn.celloud.config.*;

public class Selenium2Proxy {
	private WebDriver driver;
	
	public Selenium2Proxy(WebDriver driver){
		this.driver=driver;
	}
	
	public void CaptureScreenShout(){
		String dir_name=GetTestProperties.getPicDir();
		//判断目录是否存在
		if (!(new File(dir_name).isDirectory())){
			//如果不存在，则创建一个
			new File(dir_name).mkdir();
			
		}		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMDD-HHmmss");
		String time=sdf.format(new Date());
		
		
	}

}
