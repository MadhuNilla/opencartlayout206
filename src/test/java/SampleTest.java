import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount=0,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
       usageReport = true,
        toPDF = true,
        // outputFolder = "${user.dir}/DATE(dd-MM-yyyy)"
        includeCoverageTags = {"@passed" },
        outputFolder = "target")

@CucumberOptions(plugin={"html:target/cucumber-html-report",
                "json:target/cucumber.json",
                 "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
        "junit:target/cucumber-results.xml"},
                features="src/test/resources/featurefiles/sample",strict = false,
                 //glue="classpath",
                tags={"@smoke"})
public class SampleTest extends AbstractTestNGCucumberTests {
}



