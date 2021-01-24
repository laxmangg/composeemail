package com.smart_wash_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaherDetailsPage {
	    WebDriver driver;
	     @FindBy(id="business_name")
	     WebElement Bn;
	  
	     @FindBy(id="contact_person_name")
	     WebElement pn;
	    
	    @FindBy(id="contact_person_email")
	    WebElement cp;
	    
	    @FindBy(id="contact_person_number")
	    WebElement mobile;
	    
	    @FindBy(id="password")
	    WebElement pass;
	    @FindBy(id="confirm_password")
	    WebElement cpass;
	    
	    @FindBy(xpath="//button[@type='submit']")
	    
	       WebElement nxt;
	    @FindBy(id="business_address")
		 WebElement Ba;
		@FindBy(id="zipcode") WebElement zp;
		@FindBy(id="city")WebElement cy;
		@FindBy(id="state") WebElement st;
		@FindBy(id="country") WebElement ct;
		@FindBy(xpath="//div[@class='completed step']")WebElement l1;
		 @FindBy(xpath="//button[@type='submit']") WebElement nxt1;
		  

	    
	     public  void Page1(String bus,String per,String cpe,String cpn,String string ,String string2) throws InterruptedException
	     {
	    	 
	    	 System.out.println("business_name enter");
	    	 Bn.sendKeys(bus);
	  
	    	  Thread.sleep(3000);
	    	 System.out.println("contact_person_number enter");
	    	 
	    	 pn.sendKeys(per);
	    	 
	    	 Thread.sleep(3000);
	    	 System.out.println("mail enter");
	    	 cp.sendKeys(cpe);
	   
	    	 Thread.sleep(3000);
	    	 
	    	 System.out.println("mobile number enter:"+mobile);
	    	 mobile.sendKeys(cpn);
	   
	    	 Thread.sleep(3000);
	    	 
	    	  System.out.println("password enter:"+pass);
	    	 pass.sendKeys(string);
	    	 
	    	  Thread.sleep(3000);
	    	 System.out.println("enter confirm password:"+cpass);
	    	 cpass.sendKeys(string2);
	    	 
	    	 Thread.sleep(3000);
	    	 
	    	 System.out.println("click on next button:"+nxt);
	    	  nxt.click();
	    	  
	    	 
	     }
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
