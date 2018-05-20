package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;

public class ThirdClass {

	WebDriver dr = new FirefoxDriver();

	public ThirdClass(){

	}

	@Then("User is able to launch firefox and redirect to facebook$")
	public void launchBrowser(){

		dr.get("https://www.facebook.com");
	}

	@Then("User enters username and password in the search text box$")
	public void enterTextSearchBox() throws InterruptedException{
		dr.manage().window().maximize();
		Thread.sleep(4000);
		dr.findElement(By.id("email")).sendKeys("test@test.com");

		dr.findElement(By.id("pass")).sendKeys("test");
	}

	@Then("User click on login button$")
	public void clickSearchButton(){

		dr.findElement(By.id("u_0_2")).click();
		dr.close();

	}

}