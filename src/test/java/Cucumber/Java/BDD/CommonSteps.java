package Cucumber.Java.BDD;

import java.net.MalformedURLException;

import Pages.BasePage;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.And;


public class CommonSteps {

   BasePage basePage = new BasePage();
   
   public CommonSteps() {
	   basePage = new BasePage();
   }
   
   @Given("^The user opens a Browser and navigates to the Fifa 2020 app root URL$") 
   public void goToFifa2020Site() throws MalformedURLException{
		
	   basePage.openBrowser();
	   
   }
	
   @And("^The user closes the browser session$") 
   public void closeBrowserSession() {   

	   basePage.closeBrowser();
	   
   }
	
}