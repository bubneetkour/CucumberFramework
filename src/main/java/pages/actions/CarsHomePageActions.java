package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarHomePageLocators;
import utils.SeleniumWebDriver;

public class CarsHomePageActions {
	
	CarHomePageLocators carHomePageLocatorsObj;
	
	public CarsHomePageActions() {
		carHomePageLocatorsObj = new CarHomePageLocators();
		PageFactory.initElements(SeleniumWebDriver.getDriver(),carHomePageLocatorsObj);
		
	}
	
	public void moveToBuySellLink() {
		Actions obj = new Actions(SeleniumWebDriver.getDriver());
		obj.moveToElement(carHomePageLocatorsObj.buySellMenuLink).build().perform();
	}

	public void clickSearchCarsLink() {
		carHomePageLocatorsObj.searchCarsSubMenuLink.click();
	}
	
	
    public void moveToReviewsLink() {
		
	}

}
