package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_tc_001 extends BaseClass{
	
	
	@Test
	public void verify_TestLogin_validCredential() {
		
		// WebElement
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		Library.custom_sendKeys(login.getTxt_emaiId(),excel.getStringData("Sheet1", 0, 0),"EmailId");
		Library.custom_sendKeys(login.getTxt_password(),excel.getStringData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getBtn_login(),"Login");
		
		Library.custom_HandleDropDown(null, null);
		Library.custom_handleMouseHover_click(null, null);
		
	}

}
