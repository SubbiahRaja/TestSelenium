package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.basetest;
import pages.loginpage;

public class logintest extends basetest {
	
	loginpage screen;
	@BeforeClass
	public void init() {
	screen = new loginpage(driver);
	
	}
	@Test
	public void search() {
		screen.entersearch("iphone 17 pro max" + Keys.ENTER);
	}
	@Test(dependsOnMethods = "search")
	public void click() {
		screen.clickenter();
	}
}

	
