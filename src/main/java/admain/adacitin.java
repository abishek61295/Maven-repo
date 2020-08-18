package admain;

import adacitintask.basepage;
import adlog.bookhotel;
import adlog.loginpage;
import adlog.orderprint;
import adlog.searchhotel;
import adlog.selecthotel;

public class adacitin extends basepage{
	public static void main(String[]args){
		
		basepage adc = new basepage();
		
		adc.getdriver();
		adc.geturl("http://adactinhotelapp.com/");
	
		
		loginpage log = new loginpage();
		adc.enterdetails(log.getUsername(),"adminabi");
		adc.enterdetails(log.getPassword(),"123456");
		adc.button(log.getLogin());
		
		searchhotel sh = new searchhotel();
		adc.SelectByIndex(sh.getLocation(), 2);
		adc.SelectByIndex(sh.getHotels(), 4);
		adc.SelectByIndex(sh.getRoomtype(), 3);
		adc.SelectByIndex(sh.getNoofrooms(), 2);
		adc.enterdetails(sh.getCheckin(), "11/08/2020");
		adc.enterdetails(sh.getCheckout(), "12/08/2020");
		adc.SelectByIndex(sh.getAdutls(), 3);
		adc.SelectByIndex(sh.getChildren(), 2);
		adc.button(sh.getSubmit());
		
		selecthotel sl = new selecthotel();
		adc.button(sl.getRadiobutton());
		adc.button(sl.getConti());
		
		bookhotel bh = new bookhotel();
		adc.enterdetails(bh.getFirstname(), "Abishek");
		adc.enterdetails(bh.getLastname(), "Srinivasan");
		adc.enterdetails(bh.getAddress(), "Bourke Street");
		adc.enterdetails(bh.getCcnum(), "7339346491508435");
		adc.SelectByIndex(bh.getCctype(), 1);
		adc.SelectByIndex(bh.getExpirymonth(), 8);
		adc.SelectByIndex(bh.getExpiryyear(), 12);
		adc.enterdetails(bh.getCCVno(), "712");
		adc.button(bh.getBooknow());
		
		orderprint on = new orderprint();
		adc.isElementVisible(on.getOrderno().getText());
		adc.getTxtAttribute(on.getOrderno());
		
		System.out.println("hello");
	}

}