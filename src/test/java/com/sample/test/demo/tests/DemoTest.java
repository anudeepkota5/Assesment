package com.sample.test.demo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.ai.model.Model;
import com.sample.test.demo.api.Openweathermap;
import com.sample.test.demo.api.RestResponse;
import com.sample.test.demo.pages.BookingConfirmation;
import com.sample.test.demo.pages.BookingPage;
import com.sample.test.demo.pages.FlightsPage;
import com.sample.test.demo.pages.HomePage;

public class DemoTest extends TestBase {
	
	HomePage home = null;
	FlightsPage flights = null;
	BookingPage book= null;
	
	
    @Test(dataProvider = "data", description = "Book an Flight", priority = 1)
    public void bookFlight(Hashtable<String, String> data) {
        
        home = new HomePage(driver);
        home.selectFrom(data.get("From")).selectTo(data.get("To")).clickfindFlights();
        
        flights = new FlightsPage(driver);
        String colname = data.get("Choose Flight").split(":")[0];
        String colvalue = data.get("Choose Flight").split(":")[1];
        flights.chooseFlight(colname, colvalue);
        
        book = new BookingPage(driver);
        book.enterName(data.get("Name")).enterAddress(data.get("Address")).enterCity(data.get("City")).enterstate(data.get("State"))
        .enterzipCode(data.get("Zipcode")).selectCardType(data.get("CardType")).enterCreditCardNumber(data.get("CreditCardNumber"))
        .enterCreditCardMonth(data.get("CreditCardMonth")).enterCreditCardYear(data.get("CreditCardYear"))
        .enterNameOnCard(data.get("NameOnCard")).clickPurchaseFlight();
        
        BookingConfirmation conf = new BookingConfirmation(driver);
        assertFalse(conf.getConfirmationID().isEmpty());
        System.out.println(conf.getConfirmationID());
    }
    
    @Test(dataProvider = "data",description = "Validate API with Valid city name", priority = 2)
	public void wetherAPIValidData(Hashtable<String, String> data){
		RestResponse<Model> resp = Openweathermap.getWether(data.get("From"));
		assertEquals(resp.getStatusCode(), 200);
		assertEquals(resp.getBody().getName(), data.get("From"));
	}
	
	@Test(dataProvider = "data",description = "Validate API with InValid city name", priority = 3)
	public void wetherAPIInvalidData(Hashtable<String, String> data){
		RestResponse<Model> resp = Openweathermap.getWether(data.get("From"));
		assertEquals(resp.getStatusCode(), 404);
	}
    
}
