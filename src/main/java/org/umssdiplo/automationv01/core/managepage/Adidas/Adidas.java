package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Adidas extends BasePage {
    @FindBy(xpath = "//a[@href='/hombre']")
    private WebElement hombre;

    @FindBy(css = "a[href=\"/calzado_de_futbol-hombre\"]")
    private WebElement futbol;

    @FindBy(xpath = "//span[@class='gl-price__value gl-price__value--sale']")
    private WebElement precio;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/a/img")
    private WebElement calzado;

    @FindBy(xpath = "//button[@title='Elige tu talla']")
    private WebElement talla;

    @FindBy(xpath = "//button[@title='MX 9.5']")
    private WebElement tallaelegida;

    @FindBy(xpath = "//button[@data-auto-id='add-to-bag']")
    private WebElement añadircarrito;

    @FindBy(xpath = "//span[@data-auto-id='add-to-bag-product-info-qty']")
    private WebElement cantidad;

    @FindBy(xpath = "//a[@href='//www.adidas.mx/on/demandware.store/Sites-adidas-MX-Site/es_MX/Cart-Show' and contains(@class, 'gl-cta gl-cta--primary')]")
    private WebElement vercarrito;

    @FindBy(xpath = "//a[@title='Calzado de Fútbol X 18.3 TF']")
    private WebElement titulo;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement priceshould;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement totalshould;

    public void hoverHombre() {
        Actions action = new Actions(ManageDriver.getInstance().getWebDriver());
        action.moveToElement(hombre).build().perform();
    }

    public void clickHombre() {
        CommonEvents.clickButton(futbol);
    }

    public String getPrice() {
        return CommonEvents.getTextContent(precio);
    }

    public void clickCalzado() {
        CommonEvents.clickButton(calzado);
    }

    public void clickEligeTalla() {
        CommonEvents.clickButton(talla);
        CommonEvents.clickButton(tallaelegida);
    }

    public void clickAñadirCarrito() {
        CommonEvents.clickButton(añadircarrito);
    }

    public String getCantidad() {
        String cant = cantidad.getText();
        return cant;
    }

    public void clickVerCarrito() {
        CommonEvents.clickButton(vercarrito);
    }

    public String getTitulo() {
        String tit = titulo.getText();
        return tit;
    }

    public String getPriceShould() {
        return CommonEvents.getTextContent(priceshould);
    }

    public String getTotalShould() {
        return CommonEvents.getTextContent(totalshould);
    }
}
