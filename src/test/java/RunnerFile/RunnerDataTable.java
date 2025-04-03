package RunnerFile;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"}, features="src/test/resources/com/features/Datatable.feature",
glue="StepDefenitons")

public class RunnerDataTable extends AbstractTestNGCucumberTests{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
