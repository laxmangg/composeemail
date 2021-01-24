package com.smart_wash_admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Location {
	@FindBy(id="business_address")
	 WebElement Ba;
	@FindBy(id="zipcode") WebElement zp;
	@FindBy(id="city")WebElement cy;
	@FindBy(id="state") WebElement st;
	@FindBy(id="country") WebElement ct;
	@FindBy(xpath="//div[@class='completed step']")WebElement l1;
	 @FindBy(xpath="//button[@type='submit']") WebElement nxt;
	  
	   
	  public void Loca1(String bus1,String zip,String cit,String sta,String cou)
	  {
		   l1.click();
		  Ba.sendKeys(bus1);
		  zp.sendKeys(zip);
		  cy.sendKeys(cit);
		  st.sendKeys(sta);
		  ct.sendKeys(cou);
		  nxt.click();
		  
	  }

}
