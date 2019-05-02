package org.umssdiplo.automationv01.core.managepage.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Module extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/table/tbody/tr[1]/td[3]//*[@id=\"moduleStatus\"]")
    private WebElement botonStatusHotels;

    @FindBy(xpath = "//*[@id=\"smartAlertButtons\"]/div[1]")
    private WebElement botonYesConfirm;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/table/tbody/tr[7]/td[3]//*[@id=\"moduleStatus\"]")
    private WebElement botonStatusBlog;

    public void disabledHotels() {
        CommonEvents.clickButton(botonStatusHotels);
    }

    public void disabledBlog() {
        CommonEvents.clickButton(botonStatusBlog);
    }

    public void aceptDisabledModuleHotels() {
        CommonEvents.clickButton(botonYesConfirm);
    }

    public void enabledHotels() {
        CommonEvents.clickButton(botonStatusHotels);
    }

    public void enabledBlog() {
        CommonEvents.clickButton(botonStatusBlog);
    }
}
