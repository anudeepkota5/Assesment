package com.sample.test.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(name="fromPort")
	WebElement from;
	
	@FindBy(name="toPort")
	WebElement to;
	
	@FindBy(xpath="//input[@value='Find Flights']")
	WebElement findFlights;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

	public HomePage selectFrom(String value){
		Select sel = new Select(from);
        sel.selectByValue(value);
        return this;
	}
	
	public HomePage selectTo(String value){
		Select sel = new Select(to);
        sel.selectByValue(value);
        return this;
	}
	
	public void clickfindFlights(){
		findFlights.click();
	}

}
