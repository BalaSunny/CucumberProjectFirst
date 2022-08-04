package driverFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class initDriver {
	
	public static WebDriver driver;
	private static ThreadLocal<WebDriver> drivers=new ThreadLocal<WebDriver>();
		//Initilize browser and Driver

	public static void initialization()
	{
	     	WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("version");
			 driver =new ChromeDriver(option);
			 
			setDriver(driver);
		
		getDriver().manage().window().maximize();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		getDriver().manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//getDriver().get("https://www.amazon.in/");
		getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}

   // For GetDriver ThreadLocal
	public static WebDriver getDriver()
	{
		return drivers.get();
	}
	
	// For SetDriver ThreadLocal
	public static void setDriver(WebDriver driverref)
	{
		drivers.set(driverref);
	}
	
	// For UnloadDriver ThreadLocal
	public static void  unload()
	{
		drivers.remove();
	}
	
	

}
