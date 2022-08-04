package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPageObject;
import driverFactory.initDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginStepDefination extends initDriver {
	
	//public WebDriver driver;
	
	public LoginPageObject loginpageobject;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		initDriver.initialization();
	 //  WebDriverManager.chromedriver().setup();
	   //driver = new ChromeDriver();
	   loginpageobject=new LoginPageObject();
	}

	@When("User open url {string}")
	public void user_open_url(String url) {
		//driver.get(url);
		getDriver().get(url);
	    
	}

	@When("User Enters User Name as {string} and password as {string}")
	public void user_enters_user_name_as_and_password_as(String username, String password) {
		loginpageobject.enterUserName(username);
		loginpageobject.enterPassword(password);
	}

	@When("Click On Login")
	public void click_on_login() {
	   loginpageobject.clickOnLogin();
	}

	@Then("Page TitleShould be displayed as {string}")
	public void page_title_should_be_displayed_as(String title) {
		String ActTile=getDriver().getTitle();
		Assert.assertEquals(title, ActTile);
	//	driver.close();
		}
	
	@Then("Click On welcomeLink")
	public void click_on_welcome_link() {
		loginpageobject.clickOnWelcomeLink();
	}

	@Then("Click On LogOut Link")
	public void click_on_log_out_link() {
	//loginpageobject.clickLogOut();
	//getDriver().close();
	}
	
	

}
