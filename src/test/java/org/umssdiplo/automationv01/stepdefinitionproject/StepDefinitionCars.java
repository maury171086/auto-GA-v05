package org.umssdiplo.automationv01.stepdefinitionproject;

import org.umssdiplo.automationv01.core.managepage.Cars.Cars;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepDefinitionCars {
    Cars cars = new Cars();



    /*@Given("^the 'PHP travel' page is loaded correctly$")
    public void thePHPTravelPageIsLoadedCorrectly() throws Throwable{
        cars.displayPageCars();
    }*/

    @Given("^the 'PHP travel' page is loaded correctly$")
    public void thePHPTravelPageIsLoadedCorrectly() {
        cars.displayPageCars();
    }

    @And("^click botton CARS$")
    public void clickBottonCARS() throws Throwable{
        cars.displayPageCars();

    }


    @And("^click option CARS$")
    public void clickOptionCARS() throws Throwable{
        cars.displayOtionCars();
        LoadPage.backPagePhpTravels();


    }


}
