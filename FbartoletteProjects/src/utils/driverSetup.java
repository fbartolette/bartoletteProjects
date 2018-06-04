package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {
	
	public WebDriver setupChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbartol\\git\\fbartolette\\FbartoletteProjects\\libs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}

}
