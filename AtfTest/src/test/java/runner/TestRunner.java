package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue={"stepDefinition"},
        features = "src/test/resources/features",
        tags="@Run",
        plugin = {"junit:target/cucumber.xml"})
public class TestRunner {
}
