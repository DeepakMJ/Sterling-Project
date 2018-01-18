package provisionpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.ProVisionWrappers;

public class HomePage extends ProVisionWrappers{

	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("Home")) {
			reportStep("This Not Home Page", "FAIL");
		}
	}
	public HomePage mouseOver()
	{
		mouseOverByXpath(prop.getProperty("Home.HoverMainmenu.Xpath"));
		mouseOverByXpath(prop.getProperty("Home.HoverSubmenu.Xpath"));
		return this;
		}
	
	public DTSMServiceRequestPage selectServiceRequestMenu()
	{
		clickById(prop.getProperty("Home.ClickSubmenu.id"));
		return new DTSMServiceRequestPage(driver,test);
	}
	
}
