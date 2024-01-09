package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumWebDriver;

public class CarSearchPageActions {

	CarSearchPageLocators carSearchPageLocatorsobj ;
	
	public CarSearchPageActions() {
		carSearchPageLocatorsobj =  new CarSearchPageLocators();
		PageFactory.initElements(SeleniumWebDriver.getDriver(), carSearchPageLocatorsobj);
	}
	
	public void selectModel(String model) {
		
		Select selectModelObj = new Select(carSearchPageLocatorsobj.modelDropDown);
		selectModelObj.selectByVisibleText(model);
		
	}
	
	public void selectMake(String make) {
		Select selectMakeObj = new Select(carSearchPageLocatorsobj.makeDropDown);
		selectMakeObj.selectByVisibleText(make);
	}
	
	public void selectLocation(String location) {
		Select selectLocationObj = new Select(carSearchPageLocatorsobj.locationDropDown);
		selectLocationObj.selectByVisibleText(location);
	}
	
	public void selectPrice(String price) {
		Select selectPriceObj = new Select(carSearchPageLocatorsobj.priceDropDown);
		selectPriceObj.selectByVisibleText(price);
	}
	
	public void clickFindMyNextCarButton() {
		 carSearchPageLocatorsobj.findMyNextCarButton.click();
	}
}
