package net.serenity.htmlelements.pages;

import org.openqa.selenium.WebDriver;
import net.serenity.htmlelements.blocks.SearchFormBlock;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

//Regular page class but you need to inherit not from PageObject but from BlockPageObject
public class VideoPage extends BlockPageObject {

	//Object of SearchFormBlock class
	private SearchFormBlock search;
	
	//Regular constructor for serenity page classes
	public VideoPage(WebDriver driver) {
		super(driver);
	}
	
	//Add method from the block if you need it
	public void search(String request) throws Exception {
		this.search.search(request);
	}

}
