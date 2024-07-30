package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/NewUser.feature"},
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        glue = {"steps", "utility"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/jsonReports/cucumber.json"}
        //tags = "@reg"
)
public class TestRunner {

}
