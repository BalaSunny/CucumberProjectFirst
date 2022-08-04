package testrunner;  

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/AppFeatures/Login.feature",
glue="stepdefination",
monochrome = true,
dryRun = false,

plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}

)

public class OrangeHRMRunner {

}

////////////////


/////////////////