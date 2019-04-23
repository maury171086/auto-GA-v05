package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Adidas.Adidas;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdidas {
    private Adidas adidas;
    private String price;

    @Given("^'Adidas' page is loaded$")
    public void adidasPageIsLoaded() throws Throwable {
        adidas = LoadPage.adidasPage();
    }


    @And("^hover on menu 'hombre'$")
    public void hoverOnMenuHombre() throws Throwable {
        adidas.hoverHombre();
    }

    @And("^click on subMenu 'futbol'$")
    public void clickOnSubMenuFutbol() throws Throwable {
        adidas.clickHombre();
    }

    @And("^get price from 'Calzado de Fútbol X 18.3 TF'$")
    public void getPriceFromCALZADODEFUTBOLXTF() throws Throwable {
        price = adidas.getPrice();
        System.out.println("El precio es" + price);
    }

    @And("^click on 'Calzado de Fútbol X 18.3 TF'$")
    public void clickOnCalzadoDeFútbolXTF() throws Throwable {
        adidas.clickCalzado();
    }

    @And("^click on 'Elige talla'$")
    public void clickOnEligeTalla() throws Throwable {
        adidas.clickEligeTalla();
    }

    @And("^click on 'Añadir al carrito'$")
    public void clickOnAñadirAlCarrito() throws Throwable {
        adidas.clickAñadirCarrito();
    }

    @Then("^Verificar cantidad is \"([^\"]*)\"$")
    public void verificarCantidadIs(String esperado) throws Throwable {
        String actual = adidas.getCantidad();
        Assert.assertEquals(actual, esperado);
        System.out.println(" La cantidad actual es " + actual);
        System.out.println("La cantidad esperada es " + esperado);
    }

    @And("^click on 'Ver carrito'$")
    public void clickOnVerCarrito() throws Throwable {
        adidas.clickVerCarrito();
    }

    @Then("^Verificar Titulo is \"([^\"]*)\"$")
    public void verificarTituloIsCalzadoDeFútbolXTF(String esperado) throws Throwable {
        String actual = adidas.getTitulo();
        Assert.assertEquals(actual, esperado);
        System.out.println(" El titulo actual es " + actual);
        System.out.println("La titulo esperado es " + esperado);
    }

    @Then("^Verificar Price should be \"([^\"]*)\"$")
    public void verificarPriceShouldBe(String esperado) throws Throwable {
        String actual = adidas.getPriceShould();
        Assert.assertEquals(actual, esperado);
        System.out.println(" El precio actual debe ser " + actual);
        System.out.println("La precio esperado debe ser " + esperado);
    }

    @Then("^Verificar Total should be \"([^\"]*)\"$")
    public void verificarTotalShouldBe(String esperado) throws Throwable {
        String actual = adidas.getTotalShould();
        Assert.assertEquals(actual, esperado);
        System.out.println(" El total actual debe ser " + actual);
        System.out.println("La total esperado debe ser " + esperado);
    }
}
