package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Login.SSIService;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private SSIService ssiService;

    @Given("^'SisSecurity' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        ssiService = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        ssiService.setCredentials();
        // ssiService.eliminarRegistro("abc");
    }

    @And("^click 'Registrar Maquinaria' tab in 'Header' page$")
    public void clickRegistrarMaquinariaTabInHeaderPage() throws Throwable {
//        ssiService.clickRegistrarMaquinariTab();
    }

    @And("^fill \"([^\"]*)\" nombre maquinaria campo en 'Formulario Maquina' form$")
    public void fillNombreMaquinariaCampoEnFormularioMaquinaForm(String nombreMaquinaria) throws Throwable {

    }

    @Then("^verificar que \"([^\"]*)\" esta desplago en 'Lista de Maquinarias' tabla$")
    public void verificarQueEstaDesplagoEnListaDeMaquinariasTabla(String nombreMaquinariaExperado) throws Throwable {
//        String nombreMaquinariaActual = nombreObjectoTable.getNombreTableInsertada();
//
//        Assert.assertEquals(nombreMaquinariaActual, nombreMaquinariaExperado);
    }

    @And("^fill 'Form Registrar Maquinaria' from json data \"([^\"]*)\" en 'Formulario Maquina' form$")
    public void fillFormRegistrarMaquinariaFromJsonDataEnFormularioMaquinaForm(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^click on 'Enabled module'$")
    public void clickOnEnabledModule() throws Throwable {
        ssiService.clickenabledbtn();
    }

    @And("^click on 'Module'$")
    public void clickOnModule() throws Throwable {
        ssiService.clickmodule();
    }

    @And("^click on 'Enabled'$")
    public void clickOnEnabled() throws Throwable {
        ssiService.clickenabled();
    }
}
