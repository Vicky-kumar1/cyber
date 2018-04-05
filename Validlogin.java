package script;

import org.testng.annotations.Test;

import genric.BaseTest;
import genric.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class Validlogin extends BaseTest {
@Test(priority=1,groups= {"smoke","login"})
public void testValidlogin() {
	String un=XL.getCeLLValue(XL_PATH, "Validlogin", 1, 0);
			
			String pw=XL.getCeLLValue(XL_PATH, "Validlogin", 1, 1);
			
			String eTitle=XL.getCeLLValue(XL_PATH, "Validlogin", 1, 2);
	//enter valid username
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//enter valid password
	l.setPassword(pw);
	//click login
	l.clickLogin();
	//verify home page is displayed
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.verifyTitle(driver, eTitle);
}
}
