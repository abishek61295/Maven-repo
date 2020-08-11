package adlog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adacitintask.basepage;

public class selecthotel extends basepage{
	
	public selecthotel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
		private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement conti;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	public WebElement getConti() {
		return conti;
	}

	}

