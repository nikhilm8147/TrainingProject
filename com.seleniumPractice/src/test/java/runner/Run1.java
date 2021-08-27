package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature1",glue="stepDefinition")
public class Run1 extends AbstractTestNGCucumberTests {

}
