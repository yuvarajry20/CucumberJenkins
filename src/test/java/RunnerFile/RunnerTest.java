package RunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports/Cucumber.html"}, features="src/test/resources/com/features/Login.feature",
glue="StepDefenitons")

public class RunnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
