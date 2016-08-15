package net.serenity.htmlelements.steps;

import net.serenity.htmlelements.pages.VideoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

//Regular page class
public class VideoPageSteps extends ScenarioSteps  {

	//Generate UID for proper serialization 
	private static final long serialVersionUID = 7964714980287811826L;
	
	//Regular constructor for serenity steps classes
	public VideoPageSteps(Pages pages) {
		super(pages);		
	}
	
	//Get Video page
	public VideoPage onVideoPage() {
		return pages().get(VideoPage.class);
	}
	
	//Create steps for search using method from page
	@Step("Searching for the request")
	public void search(String request) throws Exception {
		onVideoPage().search(request);
	}

}
