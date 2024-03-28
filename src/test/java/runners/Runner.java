package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/rapor.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/resources",
        glue = {"stepDefinitions"},
        tags = "@US008",

                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        tags = "@US18",
        dryRun = false

)

public class Runner {
}


