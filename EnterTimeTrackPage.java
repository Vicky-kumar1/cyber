package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	@FindBy(xpath="//div[contains(text(),'Help']")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTime;
	
	@FindBy(xpath="//span[starts-with(.,'actiTIME')]")
	private WebElement version;
	
	@FindBy(id="aboutPopupCloseButtonID")
	private WebElement closeBTN;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifyTitle(WebDriver driver,String eTitle) {
		WebDriverWait wait=new WebDriverWait(driver,10);
	try {
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Pass:Home page is displayedd",true);
	}
	catch(Exception e) {
		Reporter.log("Fail:Page is not Displayed",true);
		Assert.fail();
	}
	}
public void clickHelp() {
	help.click();
}
public void clickAboutActiTIME() {
	aboutActiTime.click();
}
public void verifyVersion(String eVersion) {
	String aVersion=version.getText();
	Assert.assertEquals(aVersion, eVersion);
}
public void clixkCloseButton() {
	closeBTN.click();
}
public void clickLogout() {
	logout.click();
}
}

