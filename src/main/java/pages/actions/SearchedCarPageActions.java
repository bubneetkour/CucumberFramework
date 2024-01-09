package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.SearchedCarPageLocators;
import utils.SeleniumWebDriver;

public class SearchedCarPageActions {

	SearchedCarPageLocators searchedCarPageLocatorsobj;
	public SearchedCarPageActions() {
		searchedCarPageLocatorsobj =  new SearchedCarPageLocators();
		PageFactory.initElements(SeleniumWebDriver.getDriver(), searchedCarPageLocatorsobj);
	}

	public String getSearchedCarPageHeader() {
		
		return(searchedCarPageLocatorsobj.searchedCarTitle.getText());
		
	}
	
}
