package test.java.step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/Destination/web"},
                 features = {"src/test/java/resources"})
public class RunCukesTest {

}
