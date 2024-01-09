package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchedCarPageLocators {
	
	@FindBy(xpath="//div[@class='searchTop']/h1")
	public WebElement searchedCarTitle;

}
