import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class SevenFacetteCukesTest {

    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"})
    public class RunCucumberTest {
    }
}
