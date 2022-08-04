package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.initDriver;


public class LoginPageObject extends initDriver{
	//WebDriver ldriver;
	
	
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement psd;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@id=\"welcome\"]")
	WebElement welcomeLink;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logOut;
	
	public LoginPageObject()
	
	{
		//ldriver=rdriver;
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterUserName(String uName)
	{
		username.sendKeys(uName);
	}
	
	public void enterPassword(String pws)
	{
		psd.sendKeys(pws);
	}

	public void clickOnLogin()
	{
		loginbtn.click();
	}
		
	public void clickOnWelcomeLink()
	{
		//Instantiating Actions class
		Actions actions = new Actions(getDriver());

				//Hovering on main menu
				actions.moveToElement(welcomeLink);
				//To mouseover on sub menu
				actions.click().build().perform();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				actions.moveToElement(logOut);
				actions.click().build().perform();
			//	actions.moveToElement(signOutLink);
				//build()- used to compile all the actions into a single step 
				

		
		//welcomeLink.click();
				getDriver().close();
	}
	
	public void clickLogOut()
	{
		//String titile=getDriver().getTitle();
		//System.out.println("*************Tititle========********"+titile);
		//logOut.click();
	//	ldriver.close();
		
	
	}
	
	
}
