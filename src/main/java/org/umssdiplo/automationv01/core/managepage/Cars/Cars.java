package org.umssdiplo.automationv01.core.managepage.Cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Cars extends BasePage {
    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[10]/a")
    private WebElement botonMenuCars;
    @FindBy(xpath = "//*[@id=\"Cars\"]/li[1]/a")
    private WebElement botonSubmenuCars;
    @FindBy(xpath = "//div[@id=\"content\"]/div[2]/form/button")
    private WebElement botonAddCars;
    @FindBy(name = "carname")
    private WebElement insertarNombreCoche;
    @FindBy(id = "add")
    private WebElement botonSubmitCar;
    @FindBy(id = "12")
    private WebElement botonEliminarCar;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[12]/span/a[1]/i")
    private WebElement botonEditarcars;
    @FindBy(name = "carname")
    private WebElement inserEditNameCars;
    @FindBy(id = "update")
    private WebElement botonSubmitNameCars;

    public void clickMenuCars(){
        CommonEvents.clickButton(botonMenuCars);
    }

    public void clickSubMenuCars(){
        CommonEvents.clickButton(botonSubmenuCars);
    }

    public void clickAddCars(){
        CommonEvents.clickButton(botonAddCars);
    }
    public Cars InsertNameCars(String name_cars){
        CommonEvents.setInputField(insertarNombreCoche, name_cars);
        return this;
    }
    public void clickButtonSubmitForm(){
        CommonEvents.clickButton(botonSubmitCar);
    }
    public void clickDeleteCars(){
        CommonEvents.clickButton(botonEliminarCar);
    }

    public void clickBotonEditar(){
        CommonEvents.clickButton(botonEditarcars);
    }
    public Cars InsertNameCarsEdit(String name_cars_edit){
        CommonEvents.setInputField(inserEditNameCars, name_cars_edit);
        return this;
    }
    public void ClickSubmitEditNameCars(){
        CommonEvents.clickButton(botonSubmitNameCars);
    }
}
