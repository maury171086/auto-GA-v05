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


    @FindBy(css =".fa fa-times")
    private WebElement eliminar;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[12]/span/a[1]/i")
    private WebElement editar;

    @FindBy(name = "carname")
    private WebElement editarCars;

    @FindBy(id = "update")
    private WebElement submitEditar;


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

    public void editBtt(){
        CommonEvents.clickButton(editar);
    }

    public void txtEditImput(String txtEdit){
        CommonEvents.setInputField(editarCars, txtEdit);
    }

    public void submitEditBtt(){
        CommonEvents.clickButton(submitEditar);
    }

}
