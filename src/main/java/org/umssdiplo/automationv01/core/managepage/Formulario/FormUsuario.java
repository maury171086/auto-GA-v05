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



    @FindBy(name = "password")
    private WebElement campoPassword;

    @FindBy(name = "mobile")
    private WebElement campoMobile;

    @FindBy(xpath = "//*[@id=\"s2id_autogen1\"]")
    private WebElement seleccionContry;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/div/div[6]/div/select/option[16]")
    private WebElement botonBolivia;

    @FindBy(name = "address1")
    private WebElement campoAddress1;

    @FindBy(css = ".icheckbox_square-grey")
    private WebElement botonSubscriber;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/div/div[17]/div[1]/div/div[2]/ul/li[1]/label/div")
    private WebElement checkHotels;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/div/div[17]/div[1]/div/div[2]/ul/li[2]/label/div")
    private WebElement checkTours;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[3]/button")
    private WebElement botonSubmit;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[8]/span/a[1]")
    private WebElement botonEdit;

    @FindBy(xpath = "//*[@id=\"146\"]")
    private WebElement botonDelete;

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

    public void insertMobilNumber(String number) {
        CommonEvents.setInputField(campoMobile, number);
    }

    public void selectCountryBolivia() {
        CommonEvents.clickButton(seleccionContry);
        CommonEvents.clickButton(botonBolivia);
    }

    public void insertAddres1(String addres1) {
        CommonEvents.setInputField(campoAddress1, addres1);
    }

    public void pressButtonSubscriber() {
        CommonEvents.clickButton(botonSubscriber);
    }

    public void insertCheckHotels() {
        CommonEvents.clickButton(checkHotels);
    }

    public void insertTours() {
        CommonEvents.clickButton(checkTours);
    }

    public void pressButtonSubmit() {
        CommonEvents.clickButton(botonSubmit);
    }

    public void pressButtonEdit() {
        CommonEvents.clickButton(botonEdit);
    }

    public void pressButtonDelete() {
        CommonEvents.clickButton(botonDelete);
    }

    public void pressButtonAceptPopsDialog() {
        CommonEvents.pressButtonAceptPopsDialog();
    }
}
