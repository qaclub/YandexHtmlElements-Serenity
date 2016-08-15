package net.serenity.htmlelements.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenity.htmlelements.steps.DriverSteps;
import net.serenity.htmlelements.steps.EndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

//Run with SerenityRunner
@RunWith(SerenityRunner.class)
public class UseVideoYandexSearchFormTest {
	
	//Get driver
	@Managed
	public WebDriver driver;		

	//Get pages
	@ManagedPages()
	public Pages pages;
	
	//Get EndUserSteps
	@Steps
	EndUserSteps endUser;
	
	//Get DriverSteps
	@Steps
	DriverSteps driverSteps;
	
	//URL for testing
	private final String URL = "https://yandex.ua/images/";
	//private final String URL = "https://yandex.ua/video/";
	//Request string
	private final String request = "GeeksForLess";
	
	//Before method
	@Before
	public void setUp() throws Exception {	
		//Using navigateTo() from DriverSteps
		driverSteps.navigateTo(URL);
	}
	
	//Test method
	@Test
	public void runUseVideoYandexSearchFormTest() throws Exception {
		//Using Image page search form search for request string
		endUser.atImagesPage().search(request);
	}
	
	

}
