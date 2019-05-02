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


    @Given("^pagina 'php travels' cargar$")
    public void paginaPhpTravelsCargar() {
        cars = LoadPage.CarsPage();
    }

    @And("^click 'ADD' boton$")
    public void clickADDBoton() throws Throwable{
        cars.clickBtAdd();
    }

    @And("^insert \"([^\"]*)\" name cars$")
    public void insertNameCars(String nameCar) throws Throwable {
        cars.nameCars(nameCar);
    }

    @And("^insert \"([^\"]*)\" on text field$")
    public void insertOnTextField(String text) throws Throwable {
        cars.textImput(text);
    }

    @And("^click 'SUBMIT' boton$")
    public void clickSUBMITBoton() throws Throwable{
        cars.clickBttSubmit();
    }

    @And("^click 'DELETE' boton$")
    public void clickDELETEBoton() throws Throwable{
        cars.deleteBtt();
    }

    @And("^click 'EDIT' boton$")
    public void clickEDITBoton() throws Throwable{
        cars.editBtt();
    }

    @And("^insert \"([^\"]*)\" name is cars$")
    public void insertNameIsCars(String txtEdit) throws Throwable {
        cars.txtEditImput(txtEdit);

    }

    @And("^click 'SUBMIT' boton edit$")
    public void clickSUBMITBotonEdit() throws Throwable{
        cars.submitEditBtt();
    }

    @And("^click Sub Menu 'CARS' in home menu$")
    public void clickSubMenuCARSInHomeMenu() {
        cars.clickSubMenuCars();
    }

    @And("^click 'Cars' in home sub menu$")
    public void clickCarsInHomeSubMenu() {
        cars.clickButtonCars();
    }


}
