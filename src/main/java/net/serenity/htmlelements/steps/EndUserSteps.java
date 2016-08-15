package net.serenity.htmlelements.steps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepFactory;

//Steps class that get Image and Video steps
public class EndUserSteps extends ScenarioSteps  {
	
	//Generate UID for proper serialization 
	private static final long serialVersionUID = -2513098979730548740L;
	
	//Regular constructor for serenity steps classes
	public EndUserSteps(Pages pages) {
		super(pages);		
	}
	
	//Get Steps class for image page using StepFactory() and getStepLibraryFor()
	public ImagesPageSteps atImagesPage() {
		return new StepFactory(getPages()).getStepLibraryFor(ImagesPageSteps.class);
	}
	
	//Get Steps class for video page using StepFactory() and getStepLibraryFor()
	public VideoPageSteps atVideoPage() {
		return new StepFactory(getPages()).getStepLibraryFor(VideoPageSteps.class);
	}

}
