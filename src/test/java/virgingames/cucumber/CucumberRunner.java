package virgingames.cucumber;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import virgingames.testbase.TestBase;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/")
public class CucumberRunner extends TestBase {

}
