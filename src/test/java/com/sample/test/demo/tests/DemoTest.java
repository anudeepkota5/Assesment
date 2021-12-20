package com.sample.test.demo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

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
	
	
    @Test(description = "Book an Fligh", priority = 2)
    public void bookFlight() {
        
        home = new HomePage(driver);
        home.selectFrom("Portland").selectTo("Dublin").clickfindFlights();
        
        flights = new FlightsPage(driver);
        flights.chooseFlight("1", "Virgin America");
        
        book = new BookingPage(driver);
        book.enterName("Anudeep").enterAddress("Bnarayanapura").enterCity("Bangalore").enterstate("KA").enterzipCode("560016").selectCardType("American Express")
        .enterCreditCardNumber("9999999999999999").enterCreditCardMonth("12").enterCreditCardYear("2023")
        .enterNameOnCard("Anudeep Kota").clickPurchaseFlight();
        
        BookingConfirmation conf = new BookingConfirmation(driver);
        assertFalse(conf.getConfirmationID().isEmpty());
        System.out.println(conf.getConfirmationID());
    }
    
    @Test(description = "Validate API with Valid city name", priority = 0)
	public void wetherAPIValidData(){
		RestResponse<Model> resp = Openweathermap.getWether("Los Angeles");
		assertEquals(resp.getStatusCode(), 200);
		assertEquals(resp.getBody().getName(), "Los Angeles");
	}
	
	@Test(description = "Validate API with InValid city name", priority = 1)
	public void wetherAPIInvalidData(){
		RestResponse<Model> resp = Openweathermap.getWether("ABC");
		assertEquals(resp.getStatusCode(), 404);
	}
    
}
