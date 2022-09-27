package testRunner;

import org.junit.runner.RunWith;

	
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:target/cucumber.html","json:target/Lms_Phase2_reports.json"}, // reporting purpose
		monochrome=true, //console output,
		features={"classpath:Features"}, //location of feature file
		glue={"stepDefinitions", "AppHooks"},
		dryRun=false
		) // location of step definition files
		
		
public class TestRunner {

}

