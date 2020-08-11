package adlog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adacitintask.basepage;

public class searchhotel extends basepage{
	
	public searchhotel(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adutls;
	
	@FindBy(id="child_room")
	private WebElement children;
	
	@FindBy(id="Submit")
	private WebElement submit;

	
	
	public WebElement getAdutls() {
		return adutls;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getLocation() {
		return location;
	}

}
