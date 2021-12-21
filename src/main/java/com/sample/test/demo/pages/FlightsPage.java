package com.sample.test.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {
	
	WebDriver driver;
	
	String str = "//tr[count(//td[text()='{1}']/parent::tr/preceding-sibling::tr)+1]//td[count(//th[text()='{2}']/preceding-sibling::th)+1]/parent::tr/td[1]/input";
	
	public FlightsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void chooseFlight(String colname, String value){
		driver.findElement(By.xpath(str.replace("{1}", value).replace("{2}", colname))).click();
	}
}
