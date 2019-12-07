package ca.automation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * created by Shoby on 2019-11-28
 **/

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/LaunchSite.feature",
        glue = "ca.automation.glue"
)
public class TestRunner {
}
