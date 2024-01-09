package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSearchPageLocators {
	
	@FindBy(id ="makes")
	public WebElement makeDropDown;
	
	@FindBy(id ="models")
	public WebElement modelDropDown;
	
	@FindBy(id ="locations")
	public WebElement locationDropDown;

	@FindBy(id ="priceTo")
	public WebElement priceDropDown;
	
	@FindBy(id ="search-submit")
	public WebElement findMyNextCarButton;

}
