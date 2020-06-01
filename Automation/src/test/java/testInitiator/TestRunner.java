package testInitiator;

import java.io.FileNotFoundException;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions (
features = "src/test/java/features/CompletingWorkFlowTask.feature" ,
glue = "stepDefination")

public class TestRunner extends AbstractTestNGCucumberTests{
	
Base bst = new Base();
	
@BeforeClass

public void initiliazeURL() throws FileNotFoundException {	
	bst.launchBrowser();
	
}


}
 