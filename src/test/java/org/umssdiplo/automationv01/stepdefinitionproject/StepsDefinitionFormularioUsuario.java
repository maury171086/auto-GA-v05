package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Formulario.FormUsuario;

public class StepsDefinitionFormularioUsuario {
    Dashboard dashboard = new Dashboard();
    FormUsuario formularioUsuario;

    @Given("^mostrar formulario de un nuevo Usuario$")
    public void mostrarFormularioUsuario() throws Throwable {
        dashboard.displayAdminsManagement();
        formularioUsuario = new FormUsuario();
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

    @And("^insert \"([^\"]*)\" country$")
    public void agregarCampoCountry(String country) {
        formularioUsuario.insertContry(country);
    }

    @And("^click button subscriber$")
    public void clickButtonSubscriber() {
        formularioUsuario.pressButtonSubscriber();
    }
}
