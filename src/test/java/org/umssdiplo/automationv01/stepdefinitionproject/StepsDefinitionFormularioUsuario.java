package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Formulario.FormUsuario;

public class StepsDefinitionFormularioUsuario {
    Dashboard dashboard = new Dashboard();
    FormUsuario formularioUsuario;

    @Given("^mostrar page admins management$")
    public void mostrarPageAdminsManagement() throws Throwable {
        dashboard.displayAdminsManagement();
        formularioUsuario = new FormUsuario();
    }

    @And("^press button new username$")
    public void displayFormUsername() {
        dashboard.createNewUser();
    }

    @And("^insert \"([^\"]*)\" firstname$")
    public void agregarCampoFistname(String firstname) {
        formularioUsuario.insertFirstname(firstname);
    }

    @And("^insert \"([^\"]*)\" lastname$")
    public void agregarCampoLastname(String lastname) {
        formularioUsuario.insertLastname(lastname);
    }

    @And("^insert \"([^\"]*)\" email$")
    public void agregarCampoEmail(String email) {
        formularioUsuario.insertEmail(email);
    }

    @And("^insert \"([^\"]*)\" password$")
    public void agregarCampoPassword(String password) {
        formularioUsuario.insertPassword(password);
    }

    @And("^insert \"([^\"]*)\" mobile number$")
    public void agregarCampoMobilNumber(String number) {
        formularioUsuario.insertMobilNumber(number);
    }

    @And("^select Bolivia country$")
    public void seleccionarPaisBolivia() {
        formularioUsuario.selectCountryBolivia();
    }

    @And("^insert \"([^\"]*)\" addres 1$")
    public void agregarCampoAddres1(String addres1) {
        formularioUsuario.insertAddres1(addres1);
    }

    @And(("^press check box hotels$"))
    public void pressCheckHotels() {
        formularioUsuario.insertCheckHotels();
    }

    @And("^click button subscriber$")
    public void clickButtonSubscriber() {
        formularioUsuario.pressButtonSubscriber();
    }

    @And("^press check tours$")
    public void clickButtonTours() {
        formularioUsuario.insertTours();
    }

    @Then("^press button submit$")
    public void clickButtonSubmit() {
        formularioUsuario.pressButtonSubmit();
    }

    @And("^press button edit$")
    public void pressButtonEdit() {
        formularioUsuario.pressButtonEdit();
    }

    @And("^press button delete$")
    public void pressButonDelete() {
        formularioUsuario.pressButtonDelete();
    }

    @Then("^press button acept popus dialog$")
    public void pressButtonAcept() {
        formularioUsuario.pressButtonAceptPopsDialog();
    }
}
