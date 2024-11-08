package com.mercator.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        glue = "com/mercator/stepDefs",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@wip"
)
public class Runner {
}
