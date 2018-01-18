package provisionpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Vision {
	public static RemoteWebDriver driver;
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.3.12:3050/Login.aspx");
		driver.findElementById("tbUserName").sendKeys("RAJAMOORTHY");
		driver.findElementById("tbPassword").sendKeys("test$000");
		driver.findElementById("btnsubmit").click();
		Actions actions = new Actions(driver);
		//WebElement mainmenu = driver.findElement(By.id("Menu_atagTransaction"));
		//WebElement submenu = driver.findElement(By.id("Menu_atagDTSMServiceRequest"));
		
		WebElement mainmenu = driver.findElementByXPath("//*[contains(text(),'General Services')]");
		WebElement submenu = driver.findElementByXPath("//*[contains(text(),'Fax Tracking')]");
		actions.moveToElement(mainmenu).moveToElement(submenu).click().perform();
		driver.findElementById("tbFolioNo").sendKeys("1000");
	}
}

