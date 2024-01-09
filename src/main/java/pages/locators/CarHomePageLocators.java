package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CarHomePageLocators {
	
	@FindBy(linkText= "buy + sell")
	public WebElement buySellMenuLink;
	
	@FindBy(linkText="Search Cars")
	public WebElement searchCarsSubMenuLink;

}
