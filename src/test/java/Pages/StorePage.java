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
	
	
	By.ByCssSelector byStoreNavBarLink = new By.ByCssSelector("ul.navbar-nav > li > a[href='/store']");
	By.ByXPath byDelayedTextBox = new By.ByXPath("//app-root/div[2]/tienda/div[1]/div[4]/input[1]");
	By.ByCssSelector byDelayedButton = new By.ByCssSelector("parque button");
	
	int interval = 0;
	int timeElapsed = 0;		
	
	public StorePage() {
	
	}

	public void sendKeyToDelayedTextBoxAndReturnWhenButtonAppears() {
		
		WebElement delayedTextBox = driver.findElement(byDelayedTextBox);
		delayedTextBox.sendKeys("ABC");
		
	     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	                .withTimeout(60, TimeUnit.SECONDS)
	                .pollingEvery(5, TimeUnit.SECONDS)
	                .ignoring(org.openqa.selenium.NoSuchElementException.class);
	        
	     Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
               public WebElement apply(WebDriver driver) {
                	
    				interval++;
    				System.out.println("Interval #" + interval + " /  Time Elapsed: " + timeElapsed + " seconds");
    				timeElapsed = timeElapsed + 5;
    				
            		WebElement element = driver.findElement(byDelayedButton);
    				if (element.isDisplayed() )
    				{
    					return element;
    				}
    				
    				return element;
                }
            };
	        
            wait.until(function);
	}
	
	public void clickOnStoresNavBarLink() {
		
	    WebElement storeNavBarLink = driver.findElement(byStoreNavBarLink);
	    storeNavBarLink.click();
		
	}
	

}


