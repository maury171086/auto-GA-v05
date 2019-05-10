package org.umssdiplo.automationv01.core.managepage.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Module extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/table/tbody/tr[1]/td[3]//*[@id=\"moduleStatus\"]")
    private WebElement botonEnabledHotels;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/table/tbody/tr[1]/td[3]//*[@id=\"moduleStatus\"]")
    private WebElement botonDisabledHotels;

    @FindBy(xpath = "//*[@id=\"smartAlertButtons\"]/div[1]")
    private WebElement botonYesConfirm;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/table/tbody/tr[7]/td[3]//*[@id=\"moduleStatus\"]")
    private WebElement botonEnabledBlog;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/table/tbody/tr[7]/td[3]/a/button")
    private WebElement botonSettingsBlog;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/table/tbody/tr[7]/td[4]//*[@id=\"moduleOrder\"]")
    private WebElement botonUpOrderModuleBlog;

    public void disabledHotels() {
        CommonEvents.clickButton(botonDisabledHotels);
    }

    public void disabledBlog() {
        CommonEvents.clickButton(botonEnabledBlog);
    }

    public void aceptDisabledModuleHotels() {
        CommonEvents.clickButton(botonYesConfirm);
    }

    public void enabledHotels() {
        CommonEvents.clickButton(botonEnabledHotels);
    }

    public void enabledBlog() {
        CommonEvents.clickButton(botonEnabledBlog);
    }

    public void displaySettingsBlog() {
        CommonEvents.clickButton(botonSettingsBlog);
    }

    public void upOrderModuleBlog() {
        CommonEvents.clickButton(botonUpOrderModuleBlog);
    }
}
