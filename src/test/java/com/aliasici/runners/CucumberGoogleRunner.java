package com.aliasici.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/aliasici/step_definitions",
        monochrome = true,
        plugin = {"pretty","html:target/HtmlReports"},
        dryRun = false,
        publish = true
)
public class CucumberGoogleRunner {
}
