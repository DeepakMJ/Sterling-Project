package provisiontestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import provisionpages.LoginPage;
import wrappers.ProVisionWrappers;

public class TC001_Login extends ProVisionWrappers{

	@BeforeClass
	public void setData() {
		testCaseName =  "DTSM_Service_Request";
		testDescription = "DTSM Service Request";
		authors = "Rajamoorthy";
		category = "smoke";
		browserName = "chrome";
		dataSheetName = "TC001";
	}

	@Test(dataProvider="fetchData")
	public void login(String uName, String pwd,String Mname,String DTSMSlNo,String Remarks){

		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.mouseOver()
		.selectServiceRequestMenu()
		.clickNew()
		.selectMachineName(Mname)
		.enterDTSMSlNo(DTSMSlNo)
		.clickDTSMSlNoDate()
		.enterRemarks(Remarks)
		.clickSubmit();

	}


}
