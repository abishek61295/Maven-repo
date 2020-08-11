package adlog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adacitintask.basepage;

public class orderprint extends basepage{
	
	public orderprint(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private WebElement orderno;
	

	public WebElement getOrderno() {
		return orderno;
	}

}
