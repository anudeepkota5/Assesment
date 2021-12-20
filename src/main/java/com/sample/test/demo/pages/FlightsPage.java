package com.sample.test.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {
	
	WebDriver driver;
	
	String str = "//tr[{1}]/td[(count(//th[text()='{2}']/preceding-sibling::th)+1)]/input";
	
	public FlightsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void chooseFlight(String rownum, String col){
		driver.findElement(By.xpath(str.replace("{1}", rownum).replace("{2}", col))).click();
	}
}
