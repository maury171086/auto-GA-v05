package org.umssdiplo.automationv01.core.managepage.Cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Cars extends BasePage {

    @FindBy(id = "social-sidebar-menu")
    private WebElement botonDashboard;

    @FindBy(id = "Cars")
    private WebElement botonCars;

    @FindBy(xpath = "//*[@id=\"Cars\"]/li[1]/a")
    private WebElement opcionCars;


    public void displayPageDashboard(){
        CommonEvents.clickButton(botonDashboard);
    }

    public void displayPageCars() {
        CommonEvents.clickButton(botonCars);
    }

    public void displayOtionCars(){
        CommonEvents.clickButton(opcionCars);
    }

}
