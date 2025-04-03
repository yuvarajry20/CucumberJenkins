package StepDefenitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMStep {
	WebDriver driver;
	
	@Given("I am in the OrangeHRM website")
	public void i_am_in_the_orange_hrm_website() {
	    // Write code here that turns the phrase above into concrete actions
//		driver=new ChromeDriver();
//		driver=new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "\"C:\\Users\\yuvar\\Downloads\\edgedriver_win64\\msedgedriver.exe\"");
		driver=new EdgeDriver();
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
	    Assert.assertEquals(actual, expec);
	}
	
	@Then("I can verify the {string} in dashBoard page")
	public void i_can_verify_the_in_dash_board_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    if(string.equalsIgnoreCase("Assign Leave")) {
	    	WebElement assign=driver.findElement(By.xpath("//p[text()='Assign Leave']"));
	    	String actual=assign.getText();
	    	String expected="Assign Leave";
	    	Assert.assertEquals(actual, expected);
	    }else if(string.equalsIgnoreCase("Leave List")) {
	    	WebElement leave=driver.findElement(By.xpath("//p[text()='Leave List']"));
	    	String actual=leave.getText();
	    	String expected="Leave List";
	    	Assert.assertEquals(actual, expected);
	    }else if(string.equalsIgnoreCase("Timesheets")) {
	    	WebElement time=driver.findElement(By.xpath("//p[text()='Timesheets']"));
	    	String actual=time.getText();
	    	String expected="Timesheets";
	    	Assert.assertEquals(actual, expected);
	    }else if(string.equalsIgnoreCase("Apply Leave")) {
	    	WebElement apply=driver.findElement(By.xpath("//p[text()='Apply Leave']"));
	    	String actual=apply.getText();
	    	String expected="Apply Leave";
	    	Assert.assertEquals(actual, expected);
	    }else if(string.equalsIgnoreCase("My Leave")) {
	    	WebElement my_leave=driver.findElement(By.xpath("//p[text()='My Leave']"));
	    	String actual=my_leave.getText();
	    	String expected="My Leave";
	    	Assert.assertEquals(actual, expected);
	    }else if(string.equalsIgnoreCase("My Timesheet")) {
	    	WebElement my_Timesheet=driver.findElement(By.xpath("//p[text()='My Timesheet']"));
	    	String actual=my_Timesheet.getText();
	    	String expected="My Timesheet";
	    	Assert.assertEquals(actual, expected);
	    }
	 driver.quit();   
	}
}
