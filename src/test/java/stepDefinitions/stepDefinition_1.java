package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.SurgeriesPage;
import PageObjects.specialistPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.Base;

public class stepDefinition_1 {
	
	
	public WebDriver driver;
	public Base b;
	public HomePage hp;
	public specialistPage sp;
	public SurgeriesPage surgeries;
	
	/*Get doctor details and surgeries
    Given practo website is open and working
    When set location as chennai
    And set specialist as dentist
    And sort the patient stories
    And sort the experience
    And sort the fees and availability
    And sort one of the relevance
    Then print first five doctor details
    And click on surgeries
    Then print list of surgeries */
	
	@Given("practo website is open and working")
	public void practo_website_is_open_and_working() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver=Hooks.getDriver();
		b=new Base();
		String title=driver.getTitle();
		Assert.assertEquals(title,b.getProperties().getProperty("title") );
		
		
	 
	}

	@When("set location as chennai")
	public void set_location_as_chennai() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		hp=new HomePage(driver);
		hp.enterLocation(b.getProperties().getProperty("location"));
		Thread.sleep(2000);
		hp.locClick();
	   
	}

	@When("set specialist as dentist")
	public void set_specialist_as_dentist() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		hp.enterSpecialist(b.getProperties().getProperty("specialist"));
		Thread.sleep(2000);
		hp.enterClick();
	  
	}

	@When("sort the patient stories")
	public void sort_the_paitent_stories() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		sp=new specialistPage(driver);
		sp.dropDownclick(sp.patientStoriesDropdownClick);
		sp.selectDropdown(sp.patientStories);
		Thread.sleep(2000);
	    
	}

	@When("sort the experience")
	public void sort_the_experience() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		sp.dropDownclick(sp.experienceDropdownClick);
		sp.selectDropdown(sp.experience);
		Thread.sleep(2000);
	    
	}

	@When("sort the fees and availability")
	public void sort_the_fees_and_availability() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		sp.dropDownclick(sp.allFiltersClick);
		sp.selectDropdown(sp.feeDropdown);
		Thread.sleep(2000);
		
		sp.dropDownclick(sp.allFiltersClick);
		sp.selectDropdown(sp.availability);
		Thread.sleep(4000);
	    
	}

	@When("sort one of the relevance")
	public void sort_one_of_the_relevance() {
	    // Write code here that turns the phrase above into concrete actions
		sp.dropDownclick(sp.sortByClick);
		sp.selectDropdown(sp.sortBy);	
	    
	}

	@Then("print first five doctor details")
	public void print_first_five_doctor_detials() {
	    // Write code here that turns the phrase above into concrete actions
		sp.printDetials();
		
	   
	}

	@Then("click on surgeries")
	public void click_on_surgeries() {
	    // Write code here that turns the phrase above into concrete actions
		surgeries=new SurgeriesPage(driver);
		surgeries.surgeries.click();
		
	    
	}

	@Then("print list of surgeries")
	public void print_list_of_surgeries() {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.scroll(surgeries.popularSurgeries);
		surgeries.printSurgiers();
	    
	}


}
