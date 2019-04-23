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

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement addCars;
    @FindBy(xpath = "//*[@id=\"GENERAL\"]/div[3]/div/input")
    private WebElement nombreAuto;

    @FindBy(xpath = "/html/body")
    private WebElement texto;
    @FindBy(xpath = "//*[@id=\"add\"]")
    private WebElement submit;


    @FindBy(xpath = "//*[@id=\"15\"]/i")
    private WebElement eliminar;


    public void displayPageDashboard(){
        CommonEvents.clickButton(botonDashboard);
    }

    public void displayPageCars() {
        CommonEvents.clickButton(botonCars);
    }

    public void displayOtionCars(){
        CommonEvents.clickButton(opcionCars);
    }


    public void clickBtAdd(){
        CommonEvents.clickButton(addCars);
    }

    public void nameCars(String nameCars){
        CommonEvents.setInputField(nombreAuto, nameCars);
    }

    public void textImput(String txt){
        CommonEvents.setInputField(texto, txt);
    }

    public void clickBttSubmit(){
        CommonEvents.clickButton(submit);
    }

    public void deleteBtt(){
        CommonEvents.clickButton(eliminar);
    }

}
