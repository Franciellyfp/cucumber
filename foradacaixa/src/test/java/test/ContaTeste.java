package test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@ContaTeste", 
glue = "cucumber.test_passos", monochrome = true, dryRun = false)
public class ContaTeste {
}