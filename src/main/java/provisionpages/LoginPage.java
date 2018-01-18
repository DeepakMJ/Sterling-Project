package provisionpages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProVisionWrappers;


public class LoginPage extends ProVisionWrappers{

	public LoginPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("Login")) {
			reportStep("This is Not ProVision LogIn Page", "FAIL");
		}
	}
	public LoginPage enterUserName(String data) {
		enterById(prop.getProperty("Login.UserName.id"), data);
		return this;
	}

	public LoginPage enterPassword(String data) {
		enterById(prop.getProperty("Login.password.id"), data);
		return this;
	}

	public HomePage clickLogin() {
		clickById(prop.getProperty("Login.LoginButton.id"));
	boolean issessionactive=verifysessionpopup(prop.getProperty("Login.verifytext.id"),"session");
		try {
			if(issessionactive) {
				clickById(prop.getProperty("Login.continuebutton.id"));
			}
			else {
				
			}
		//	clickById(prop.getProperty("Login.LoginButton.id"));
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new HomePage(driver,test);
			}
}


