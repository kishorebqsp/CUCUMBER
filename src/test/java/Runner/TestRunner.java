package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Bharani\\eclipse-workspace\\Cucumber_framework\\src\\test\\java\\files\\file.feature",
		glue= {"Stepdefinition"}

	)

 public class TestRunner {
	 
	}
