package Cucumber.Java.BDD;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.en.Given;

import static org.junit.Assert.assertEquals;
import Pages.TeamsPage;
import Pages.StorePage;

public class SubContainerPagesSteps { 
  
   TeamsPage teamsPage;
   StorePage storePage;
   
   
   public SubContainerPagesSteps(){
	   
	   teamsPage = new TeamsPage();
	   storePage = new StorePage();
   }
	
   @When("^The user clicks on Teams option of the Navigaion Bar$") 
   public void clickOnTeamsSubContainerSectionHeaderText() {   
			
	   teamsPage.clickOnTeamsNavBarLink();
   }
   
   @Then("^The Teams Sub Page must load and show 'Teams' in the Header$") 
   public void validateTextTeamsSubContainerSectionHeaderText() throws InterruptedException {   
	   
	   assertEquals("The Teams Sub Section doesn't contain the correct header text", "Teams", teamsPage.getTeamsSectionHeaderText());
	   
   }
   	
   
   @Given("^The user sends constant string 'ABC' to an input box that shows a button after a delay$")
   public void sendRandomKeyToTextBoxThatShowsAButtonWithDelay() throws InterruptedException {   
	   
	   storePage.sendKeyToDelayedTextBoxAndReturnWhenButtonAppears();
	   
   }
   	
   
} 