package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature1",glue="stepDefinition",monochrome = true,
             plugin = {"pretty"})

public class Run2 {




}
