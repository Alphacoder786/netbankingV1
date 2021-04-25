package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	
	
	public AddCustomerPage(WebDriver rdriver)
	{
		
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;

	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;

	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtstate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
			
	}

	public void custName(String cname) throws InterruptedException {
		Thread.sleep(2000);
		txtCustomerName.sendKeys(cname);
		Thread.sleep(2000);
		
	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob(String mm,String dd,String yy) throws InterruptedException {
		Thread.sleep(2000);
		txtdob.sendKeys(mm);
		Thread.sleep(2000);
		txtdob.sendKeys(dd);
		Thread.sleep(2000);
		txtdob.sendKeys(yy);
		Thread.sleep(2000);
		
	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) throws InterruptedException {
		Thread.sleep(2000);
		txtcity.sendKeys(ccity);
		Thread.sleep(2000);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(int cpinno) throws InterruptedException {
		Thread.sleep(2000);
		txtpinno.sendKeys(String.valueOf(cpinno));
		Thread.sleep(2000);
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) throws InterruptedException {
		Thread.sleep(2000);
		txtemailid.sendKeys(cemailid);
		Thread.sleep(2000);
	}

	public void custpassword(String cpassword) {
		
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() throws InterruptedException {
		Thread.sleep(2000);
		btnSubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
