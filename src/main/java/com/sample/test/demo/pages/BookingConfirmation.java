package com.sample.test.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	@FindBy(xpath = "//td[text()='Id']/following-sibling::td")
	WebElement id;
	
	public BookingConfirmation(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String getConfirmationID(){
		return id.getText();
	}
}
