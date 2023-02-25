package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
// /Selenium/
@CucumberOptions(features= "src/test/java/Features/Login.feature",
glue="steps",
monochrome=true, publish=true, tags="Group1")
public class CucumberRunner extends AbstractTestNGCucumberTests{
	
}
