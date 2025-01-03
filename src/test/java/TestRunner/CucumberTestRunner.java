package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags = "",
        features = {"src/test/java/resources/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/report/htmlreport.html"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
