package adlog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adacitintask.basepage;

public class bookhotel extends basepage{
	
	public bookhotel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement CCVno;
	
	@FindBy(id="book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getCCVno() {
		return CCVno;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

}
