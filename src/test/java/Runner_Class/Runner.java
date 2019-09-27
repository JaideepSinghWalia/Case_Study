package Runner_Class;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features//Feature_4.feature",glue = { "StepDef" },plugin = { "html:target/Cucumber_4.html" })

public class Runner {

}
