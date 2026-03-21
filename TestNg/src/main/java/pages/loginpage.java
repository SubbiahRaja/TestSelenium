package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	
	private By searchbox = By.id("twotabsearchtextbox");
	private By click = By.xpath("//h2[@aria-label=\\\"Sponsored Ad - iPhone 17 Pro Max 256 GB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Cosmic Orange\\\"]");

	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void entersearch(String content) {
		driver.findElement(searchbox).sendKeys(content);
	}
	
	public void clickenter() {
		driver.findElement(click).click();
	}
}
