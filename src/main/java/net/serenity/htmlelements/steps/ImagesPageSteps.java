package net.serenity.htmlelements.steps;

import net.serenity.htmlelements.pages.ImagesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

//Regular page class
public class ImagesPageSteps extends ScenarioSteps {
	
	//Generate UID for proper serialization 
	private static final long serialVersionUID = 484477124036440402L;
	
	//Regular constructor for serenity steps classes
	public ImagesPageSteps(Pages pages) {
		super(pages);		
	}
	
	//Get Image page
	public ImagesPage onImagesPage() {
		return pages().get(ImagesPage.class);
	}
	
	//Create steps for search using method from page
	@Step("Searching for the request")
	public void search(String request) throws Exception {
		onImagesPage().search(request);
	}
	

}
