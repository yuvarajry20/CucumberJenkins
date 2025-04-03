package StepDefenitons;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStep {
	WebDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("user is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    System.out.println("Credentials Entered");
//	    List<List<String>> signUpForm=dataTable.asLists(String.class);
	    List<Map<String, String>> user=dataTable.asMaps(String.class, String.class);
//	    String Username=signUpForm.get(0).get(0);
//	    String Password=signUpForm.get(0).get(1);
	    String Username=user.get(0).get("Username");
	    System.out.println("Username: "+Username);
	    driver.findElement(By.name("username")).sendKeys(Username);
	    String Password=user.get(0).get("Password");
	    driver.findElement(By.name("password")).sendKeys(Password);
	    driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).submit();
	    String erroMessage=user.get(0).get("ErrorMessage");
	    String actualErrorMessage=driver.findElement(By.xpath("//*[@class='orangehrm-login-error']/div[1]/div[1]/p")).getText();
	    System.out.println("Actual Error Message:"+actualErrorMessage);
	    Assert.assertTrue(actualErrorMessage.equalsIgnoreCase(erroMessage));
	}

//	@Then("User should be able to login successfully and new page open")
//	public void user_should_be_able_to_login_successfully_and_new_page_open() {
//	    // Write code here that turns the phrase above into concrete actions
//		 WebElement dashboard=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
//		    System.out.println(dashboard.getText());
//		    String actual=dashboard.getText();
//		    String expec="Dashboard";
//		    Assert.assertEquals(actual, expec);
//	}

}
