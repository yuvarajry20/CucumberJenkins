package RunnerFile;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"}, features="src/test/resources/com/features/SaucedemoLogin.feature",
glue="StepDefenitons", monochrome = true)
public class RunnerTestng extends AbstractTestNGCucumberTests {
}
