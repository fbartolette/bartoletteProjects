package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import utils.driverSetup;

class simpleTest {

	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {

		driverSetup setup = new driverSetup();
		driver = setup.setupChromeDriver();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//TODO
	}

	@Test
	void test() {
		driver.get("www.google.com");
	}

}
