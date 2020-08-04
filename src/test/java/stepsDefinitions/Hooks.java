package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	 
	 @Before
	    public void beforeScenario(){
	       acessarSistema();
	    } 
	 
	 @After
	    public void afterScenario(Scenario scenario){
		capturarScreenshot(scenario);
		driver.quit();
	    }
	}
