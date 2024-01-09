package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsHomePageActions;
import pages.actions.SearchedCarPageActions;
import utils.SeleniumWebDriver;

import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class SearchCarsSteps {
	
	CarsHomePageActions carhomePageActionsobj = new CarsHomePageActions();
	CarSearchPageActions carSearchPageACtionsObj = new CarSearchPageActions();
	SearchedCarPageActions searchedCarPageActionsobj = new SearchedCarPageActions();
	
	
	@Given("I am on the  home page {string} of carsguide website")
	public void i_am_on_the_home_page_of_carsguide_website(String url) {
	   
		SeleniumWebDriver.openPage(url);
	}

	@When("I move to menu")
	public void i_move_to_menu(DataTable dataTable) {
	  List<List<String>> menuList =  dataTable.asLists();
	  System.out.println("Select car home page menu link ==> "+ menuList.get(0));
	  carhomePageActionsobj.moveToBuySellLink();
	}

	@When("I click on the Search cars Link")
	public void i_click_on_the_search_cars_link() {
	   
		carhomePageActionsobj.clickSearchCarsLink();
	}

	@When("I select the model  {string} from Model dropdown")
	public void i_select_the_model_from_model_dropdown(String model) {
		carSearchPageACtionsObj.selectModel(model);
	
	}

	@When("I select the make  {string} from Make dropdown")
	public void i_select_the_make_from_make_dropdown(String make) {
		carSearchPageACtionsObj.selectMake(make);
	}
	
	@When("I Select the location {string} from the Location dropdown")
	public void i_select_the_location_from_the_location_dropdown(String location) {
		carSearchPageACtionsObj.selectLocation(location);
	}

	@When("I select the price {string} from the Price dropdown")
	public void i_select_the_price_from_the_price_dropdown(String price) {
		carSearchPageACtionsObj.selectPrice(price);
	}
	
	@When("I click on Find My Next Car button")
	public void i_click_on_find_my_next_car_button() {
	    carSearchPageACtionsObj.clickFindMyNextCarButton();
	}

//	@Then("the searched cars should be displayed")
//	public void the_searched_cars_should_be_displayed(String header) {
//		
//			
//	}
	@Then("the searched cars header {string} should be displayed")
	public void the_searched_cars_header_should_be_displayed(String header) {
		//System.out.println(searchedCarPageActionsobj.getSearchedCarPageHeader());
				Assert.assertEquals(header, searchedCarPageActionsobj.getSearchedCarPageHeader(),"Searched Car Header doesnot match");
	}

	@Then("the Page title should be {string}")
	public void the_page_title_should_be(String title) {
	  System.out.println(SeleniumWebDriver.getDriver().getTitle());
	  Assert.assertEquals(title, SeleniumWebDriver.getDriver().getTitle(),"Searched Car page Title doesnot match");
	}



}
