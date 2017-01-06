package cn.celloud.config;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import cn.celloud.util.CommonMethord;


public class DriverManage {
	private static Logger log = Logger.getLogger("DriverManage");
	public static WebDriver driver=null;
	
	public static WebDriver getDriver(String runDriver) throws Exception{
		
	
		switch (Integer.parseInt(runDriver)) {
		case 1:
			System.setProperty("webdriver.firefox.bin",
					"D:\\Program Files(X86)\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			log.info("running driver is ff......");
			
			break;

		case 2:
			
			System.setProperty("webdriver.ie.driver",
					CommonMethord.getRealath()+"res/IEDriverServer_64.exe");		
			driver = new InternetExplorerDriver();
			log.info("running driver is id......");
			break;

		case 3:
			System.setProperty("webdriver.chrome.driver",
					CommonMethord.getRealath()+"res/chromedriver.exe");		
			driver = new ChromeDriver();
			log.info("running driver is chrome..driver..driver......");
			
			break;
		}
		return driver;

	}
	
	
	

}
