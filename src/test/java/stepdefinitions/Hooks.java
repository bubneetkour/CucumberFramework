package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.SeleniumWebDriver;

public class Hooks {
	
	@Before
	public static void before_all() {
		
		System.out.println("launch browser");
		SeleniumWebDriver.setDriver();
	}
	
	@After
	public static void after_all() {
		
		System.out.println("close browser");
        SeleniumWebDriver.tearDown();	
	}

}
