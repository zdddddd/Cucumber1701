package com.run;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/features/first_cucumber.feature",
        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/site/rerun.txt",
                "json:target/cucumberjson.json"
        },
        tags = {"@p1"},
        glue = {"com.steps"}
)

public class RunTest extends AbstractTestNGCucumberTests {


}
