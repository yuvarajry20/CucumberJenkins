//package StepDefenitons;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class OutlineDemo {
//	WebDriver driver;
//	@Given("User is on Home Screen")
//	public void user_is_on_home_screen() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	}
//
//	@When("User enters UserName as {string} and Password as {string}")
//	public void user_enters_user_name_as_and_password_as(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.name("username")).sendKeys(string);
//	    driver.findElement(By.name("password")).sendKeys(string2);
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();  
//
//	}
//
//	@Then("User should be able to see an {string}")
//	public void user_should_be_able_to_see_an(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		if(string.equalsIgnoreCase("Invalid credentials")) {
//			WebElement p=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
//			String actual=p.getText();
//			String expected="Invalid credentials";
//			Assert.assertEquals(actual, expected);
//		}else if(string.equalsIgnoreCase("Required")) {
//			WebElement span=driver.findElement(By.xpath("//span[text()='Required']"));
//			String actual=span.getText();
//			String expected="Required";
//			Assert.assertEquals(actual, expected);
//		}
//		
//		driver.quit();
//		
//	}
//}
