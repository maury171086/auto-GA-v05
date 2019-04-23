package org.umssdiplo.automationv01.core.managepage.Formulario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FormUsuario extends BasePage {

    @FindBy(css = ".form-control")
    private WebElement tfFirstname;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/div/div[13]/div/div/label/div")
    private WebElement botonSubscriber;

    public void insertFirstname(String firstname) {
        CommonEvents.setInputField(tfFirstname, firstname);
    }

    public void pressButtonSubscriber() {
        CommonEvents.clickButton(botonSubscriber);
    }
}
