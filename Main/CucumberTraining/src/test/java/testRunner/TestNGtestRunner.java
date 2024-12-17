package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features= "src/test/java/features",
				glue="steps",
				monochrome=true, 
				snippets = SnippetType.CAMELCASE,
				dryRun = !true,
				plugin = {"html:target/cucumber.html"}
				)

public class TestNGtestRunner extends AbstractTestNGCucumberTests {

}