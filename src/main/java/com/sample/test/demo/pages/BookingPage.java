package com.sample.test.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
	
	@FindBy(name="inputName")
	WebElement name;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="zipCode")
	WebElement zipCode;
	
	@FindBy(id="cardType")
	WebElement cardType;
	
	@FindBy(id="creditCardNumber")
	WebElement creditCardNumber;
	
	@FindBy(id="creditCardMonth")
	WebElement creditCardMonth;
	
	@FindBy(id="creditCardYear")
	WebElement creditCardYear;
	
	@FindBy(id="nameOnCard")
	WebElement nameOnCard;
	
	@FindBy(xpath="//input[@value='Purchase Flight']")
	WebElement purchaseFlight;
	
	
	public BookingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public BookingPage enterName(String strname){
		name.sendKeys(strname);
		return this;
	}
	
	public BookingPage enterAddress(String straddress){
		address.sendKeys(straddress);
		return this;
	}
	
	public BookingPage enterCity(String strcity){
		city.sendKeys(strcity);
		return this;
	}
	
	public BookingPage enterstate(String strstate){
		state.sendKeys(strstate);
		return this;
	}
	
	public BookingPage enterzipCode(String strzipCode){
		zipCode.sendKeys(strzipCode);
		return this;
	}
	
	public BookingPage selectCardType(String strcardType){
		Select sel = new Select(cardType);
		sel.selectByVisibleText(strcardType);
		return this;
	}
	
	public BookingPage enterCreditCardNumber(String strcreditCardNumber){
		creditCardNumber.sendKeys(strcreditCardNumber);
		return this;
	}
	
	public BookingPage enterCreditCardMonth(String strcreditCardMonth){
		creditCardMonth.sendKeys(strcreditCardMonth);
		return this;
	}
	
	public BookingPage enterCreditCardYear(String strcreditCardYear){
		creditCardYear.sendKeys(strcreditCardYear);
		return this;
	}
	
	public BookingPage enterNameOnCard(String strnameOnCard){
		nameOnCard.sendKeys(strnameOnCard);
		return this;
	}
	
	public void clickPurchaseFlight(){
		purchaseFlight.click();
	}
		

}
