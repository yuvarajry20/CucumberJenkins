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

public class LoginStepDefinition {
	WebDriver driver=new ChromeDriver();
	@Given("I am in the OrangeHRM website")
	public void i_am_in_the_orange_hrm_website() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("I Provide Valid username")
	public void i_provide_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement username=driver.findElement(By.name("username"));
	    username.sendKeys("Admin");
	}

	@When("Provide Valid Password")
	public void provide_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	    
	}

	@When("i click on the login")
	public void i_click_on_the_login() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
	   login.click();
	}

	@Then("i can see my dashboard page")
	public void i_can_see_my_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement dashboard=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
	    System.out.println(dashboard.getText());
	    String actual=dashboard.getText();
	    String expec="Dashboard";
//	    junit.framework.Assert.assertEquals(actual,expec);
	    Assert.assertEquals(actual, expec);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
