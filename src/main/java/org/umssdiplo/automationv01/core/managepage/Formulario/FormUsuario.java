package org.umssdiplo.automationv01.core.managepage.Formulario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FormUsuario extends BasePage {

    @FindBy(name = "fname")
    private WebElement campoFirstname;

    @FindBy(name = "lname")
    private WebElement campoLastname;

    @FindBy(name = "email")
    private WebElement campoEmail;

    @FindBy(css = ".icheckbox_square-grey")
    private WebElement botonSubscriber;

    @FindBy(name = "password")
    private WebElement campoPassword;

    @FindBy(name = "mobile")
    private WebElement campoMobile;

    @FindBy(xpath = "//*[@id=\"s2id_autogen1\"]")
    private WebElement seleccionContry;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/div/div[6]/div/select/option[16]")
    private WebElement botonBolivia;

    public void insertFirstname(String firstname) {
        CommonEvents.setInputField(campoFirstname, firstname);
    }

    public void insertLastname(String lastname) {
        CommonEvents.setInputField(campoLastname, lastname);
    }

    public void insertEmail(String email) {
        CommonEvents.setInputField(campoEmail, email);
    }

    public void insertPassword(String password) {
        CommonEvents.setInputField(campoPassword, password);
    }

    public void pressButtonSubscriber() {
        CommonEvents.clickButton(botonSubscriber);
    }

    public void insertMobilNumber(String number) {
        CommonEvents.setInputField(campoMobile, number);
    }

    public void insertContry(String country) {
        CommonEvents.clickButton(seleccionContry);
        CommonEvents.clickButton(botonBolivia);
    }
}
