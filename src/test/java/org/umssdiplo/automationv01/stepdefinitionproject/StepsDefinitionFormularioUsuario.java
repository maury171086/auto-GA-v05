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

    @And("^press button new username page admins management$")
    public void displayFormUsername() {
        dashboard.createNewUser();
    }

    @And("^insert \"([^\"]*)\" firstname page form user$")
    public void agregarCampoFistname(String firstname) {
        formularioUsuario.insertFirstname(firstname);
    }

    @And("^insert \"([^\"]*)\" lastname page form user$")
    public void agregarCampoLastname(String lastname) {
        formularioUsuario.insertLastname(lastname);
    }

    @And("^insert \"([^\"]*)\" email page form user$")
    public void agregarCampoEmail(String email) {
        formularioUsuario.insertEmail(email);
    }

    @And("^insert \"([^\"]*)\" password page form user$")
    public void agregarCampoPassword(String password) {
        formularioUsuario.insertPassword(password);
    }

    @And("^insert \"([^\"]*)\" mobile number page form user$")
    public void agregarCampoMobilNumber(String number) {
        formularioUsuario.insertMobilNumber(number);
    }

    @And("^select Bolivia country page form user$")
    public void seleccionarPaisBolivia() {
        formularioUsuario.selectCountryBolivia();
    }

    @And("^insert \"([^\"]*)\" addres1 page form user$")
    public void agregarCampoAddres1(String addres1) {
        formularioUsuario.insertAddres1(addres1);
    }

    @And(("^press check box hotels page form user$"))
    public void pressCheckHotels() {
        formularioUsuario.insertCheckHotels();
    }

    @And("^click button subscriber page form user$")
    public void clickButtonSubscriber() {
        formularioUsuario.pressButtonSubscriber();
    }

    @And("^press check tours page form user$")
    public void clickButtonTours() {
        formularioUsuario.insertTours();
    }

    @Then("^press button submit$")
    public void clickButtonSubmit() {
        formularioUsuario.pressButtonSubmit();
    }

    @And("^press button edit page admins management$")
    public void pressButtonEdit() {
        formularioUsuario.pressButtonEdit();
    }

    @And("^press button delete page admins management$")
    public void pressButonDelete() {
        formularioUsuario.pressButtonDelete();
    }

    @Then("^press button acept popus dialog$")
    public void pressButtonAcept() {
        formularioUsuario.pressButtonAceptPopsDialog();
    }
}
