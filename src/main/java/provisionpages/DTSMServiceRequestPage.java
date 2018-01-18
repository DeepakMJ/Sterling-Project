package provisionpages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.ProVisionWrappers;


public class DTSMServiceRequestPage extends ProVisionWrappers{

	public DTSMServiceRequestPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("DTSM Service Request")) {
			reportStep("This is Not ProVision LogIn Page", "FAIL");
		}
	}
	public DTSMServiceRequestPage clickNew() {
		clickById(prop.getProperty("DTSMServiceRequest.ClickNew.id"));
		return this;
	}
	public DTSMServiceRequestPage selectMachineName(String data) {
		selectVisibileTextById(prop.getProperty("DTSMServiceRequest.MachineName.id"), data);
		return this;
	}

	public DTSMServiceRequestPage enterDTSMSlNo(String data) {
		enterById(prop.getProperty("DTSMServiceRequest.DTSMSlNo.id"),data);
		return this;
	}
	public DTSMServiceRequestPage clickDTSMSlNoDate() {
		clickById(prop.getProperty("DTSMServiceRequest.DTSMSlNoDate.id"));
		clickById(prop.getProperty("DTSMServiceRequest.ClickDTSMSlNoDate.id"));
		return this;
	}
	public DTSMServiceRequestPage enterRemarks(String data) {
		enterById(prop.getProperty("DTSMServiceRequest.Remarks.id"),data);
		return this;
	}
	public DTSMServiceRequestPage clickSubmit() {
		clickById(prop.getProperty("DTSMServiceRequest.Submit.id"));
		acceptAlert();
		return this;
	}

}
