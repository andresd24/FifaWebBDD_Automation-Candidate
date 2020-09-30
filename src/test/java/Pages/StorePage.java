// to be created by candidate (challenge 2):

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class StorePage extends BasePage {
	
	
	By byStoreNavBarLink = new By.ByCssSelector("ul.navbar-nav > li > a[href='/store']");
	By byDelayedButton = new By.ByCssSelector("#buttonDelay");
	By byDelayedText = new By.ByCssSelector("#textDelay");
	
	int interval = 0;
	int timeElapsed = 0;		
	
	HelperPage helperPage;
	
	public StorePage() {
		helperPage = new HelperPage();
	}

	public void pressDelayedButtonAndWaitForTextToAppear() {
		
		WebElement delayedButton = driver.findElement(byDelayedButton);
		delayedButton.click();
		
		helperPage.waitForElementDisplay(byDelayedText, 60, 2);
		
	}
	
	public void clickOnStoresNavBarLink() {
		
	    WebElement storeNavBarLink = driver.findElement(byStoreNavBarLink);
	    storeNavBarLink.click();
		
	}
	

}


