package StepDefenitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaucedemoLoginStep {
	WebDriver driver=new ChromeDriver();
		@Given("I am in the suacedemo website")
		public void i_am_in_the_suacedemo_website() {
		    // Write code here that turns the phrase above into concrete actions
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}

		@Then("I provide valid username")
		public void i_provide_valid_username() {
		    // Write code here that turns the phrase above into concrete actions
		    WebElement username=driver.findElement(By.id("user-name"));
		    username.sendKeys("standard_user");
		}

		@Then("I provide valid password")
		public void i_provide_valid_password() {
		    // Write code here that turns the phrase above into concrete actions
		    WebElement password=driver.findElement(By.id("password"));
		    password.sendKeys("secret_sauce");
		}

		@When("I click Login")
		public void i_click_login() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement login=driver.findElement(By.id("login-button"));
			login.click();
		    
		}

		@Then("I can see product page")
		public void i_can_see_product_page() {
		    // Write code here that turns the phrase above into concrete actions
		    WebElement products=driver.findElement(By.xpath("//span[text()='Products']"));
		    String actual=products.getText();
		    String expected="Products";
		    Assert.assertEquals(actual, expected);
		}

		@Then("I provide Invalid username")
		public void i_provide_invalid_username() {
		    // Write code here that turns the phrase above into concrete actions
		    WebElement invalid_username=driver.findElement(By.id("user-name"));
		    invalid_username.sendKeys("1234");
		}

		@Then("I can see Error message")
		public void i_can_see_error_message() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement error=driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']"));
		    String actual="Epic sadface: Username and password do not match any user in this service";
		    String expected=error.getText();
		    Assert.assertEquals(actual,expected);
		}

		@Then("I provide Invalid password")
		public void i_provide_invalid_password() {
		    // Write code here that turns the phrase above into concrete actions
		    WebElement invalid_Password=driver.findElement(By.id("password"));
		    invalid_Password.sendKeys("1251");
		}
		@Then("I provide no username")
		public void i_provide_no_username() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement no_username=driver.findElement(By.id("user-name"));
		}

		@Then("I provide no password")
		public void i_provide_no_password() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement no_Password=driver.findElement(By.id("password"));
		}
		@Then("I can see empty username Error message")
		public void i_can_see_empty_username_error_message() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement error=driver.findElement(By.xpath("//h3[text()='Epic sadface: Username is required']"));
		    String actual="Epic sadface: Username is required";
		    String expected=error.getText();
		    Assert.assertEquals(actual, expected);
		}

		@Then("I can see empty password Error message")
		public void i_can_see_empty_password_error_message() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement error=driver.findElement(By.xpath("//h3[text()='Epic sadface: Password is required']"));
		    String actual="Epic sadface: Password is required";
		    String expected=error.getText();
		    Assert.assertEquals(actual, expected);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
