package net.serenity.htmlelements.steps;

import org.openqa.selenium.WebDriverException;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

//Class that opens browser, maximizes window and goes to chosen URL
public class DriverSteps extends ScenarioSteps {
	
	//Generate UID for proper serialization 
	private static final long serialVersionUID = 6615780342789465516L;

	//Opens browser, maximizes window and goes to chosen URL
	@Step
	public void navigateTo(String URL) throws WebDriverException {
		getDriver().manage().window().maximize();
		getDriver().get(URL);
	}

}