package org.umssdiplo.automationv01.core.managepage.Room;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class Room extends BasePage {
    @FindBy(xpath = "//*[@id=\'social-sidebar-menu\']/li[7]/a")
    private WebElement menuhotel;
    @FindBy(xpath = "//*[@id=\'Hotels\']/li[2]/a")
    private WebElement submenuroom;
    @FindBy(xpath = "//*[@id='content']/div[2]/form/button")
    private WebElement addroom;
    @FindBy(xpath = "//*[@id=\'GENERAL\']/div[2]/div/select")
    private WebElement setstatus;
    @FindBy(css = "select[name=\"roomtype\"]")
    private WebElement sroomtype;
    @FindBy(css = "select[name=\"hotelid\"]")
    private WebElement selhotel;
    @FindBy(css = "textarea[name=\"roomdesc\"]")
    private WebElement descriproom;
    @FindBy(css = "input[name=\"basicprice\"]")
    private WebElement priceroom;
    @FindBy(css = "input[name=\"quantity\"]")
    private WebElement cantroom;
    @FindBy(css = "input[name=\"minstay\"]")
    private WebElement minstayroom;
    @FindBy(css = "input[name=\"adults\"]")
    private WebElement maxadulroom;
    @FindBy(css = "input[name=\"children\"]")
    private WebElement maxchilroom;
    @FindBy(css = "input[name=\"extrabeds\"]")
    private WebElement extrabedsroom;
    @FindBy(css = "input[name=\"bedcharges\"]")
    private WebElement bedschargesroom;
    @FindBy(css = "button[id=\"add\"]")
    private WebElement submitaddroom;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[11]/span/a[1]")
    private WebElement editroom;
    @FindBy(css = "button[id=\"update\"]")
    private WebElement submiteditroom;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/a")
    private WebElement searroom;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/input")
    private WebElement searchroom;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/span/a")
    private WebElement gosearchroom;
    @FindBy(xpath = "//*[@id=\"53\"]")
    private WebElement deleteroom;


    public void clickmenuhotel() {
        CommonEvents.clickButton(menuhotel);
    }

    public void clicksubmenuroom() {
        CommonEvents.clickButton(submenuroom);
    }

    public void clickaddroom() {
        CommonEvents.clickButton(addroom);
    }

    public Room setstatusroom(String status) {
        CommonEvents.selectOption(setstatus, status);
        return this;
    }

    public Room setroomtype(String roomtype) {
        CommonEvents.selectOption(sroomtype, roomtype);
        return this;
    }

    public void sethotel(String hotel) {
        CommonEvents.selectOption(selhotel, hotel);
    }

    public void setdescription(String descrip) {
        CommonEvents.setInputField(descriproom, descrip);
    }

    public void setprice(String precio) {
        CommonEvents.scrollComponent(priceroom, webDriver);
        CommonEvents.setInputField(priceroom, precio);
    }

    public void setcantidad(String cantidad) {
        CommonEvents.scrollComponent(cantroom, webDriver);
        CommonEvents.setInputField(cantroom, cantidad);
    }

    public void setminimunstay(String minstay) {
        CommonEvents.scrollComponent(minstayroom, webDriver);
        CommonEvents.setInputField(minstayroom, minstay);
    }

    public void setmaxadults(String maxadul) {
        CommonEvents.scrollComponent(maxadulroom, webDriver);
        CommonEvents.setInputField(maxadulroom, maxadul);
    }

    public void setmaxchildren(String maxchil) {
        CommonEvents.scrollComponent(maxchilroom, webDriver);
        CommonEvents.setInputField(maxchilroom, maxchil);
    }

    public void setnumextrabeds(String extrabeds) {
        CommonEvents.scrollComponent(extrabedsroom, webDriver);
        CommonEvents.setInputField(extrabedsroom, extrabeds);
    }

    public void setextrabedcharges(String bedscharges) {
        CommonEvents.scrollComponent(bedschargesroom, webDriver);
        CommonEvents.setInputField(bedschargesroom, bedscharges);
    }

    public void clicksubmitnewroom() {
        CommonEvents.scrollComponent(submitaddroom, webDriver);
        CommonEvents.clickButton(submitaddroom);
    }

    public void clickeditroom() {
        CommonEvents.clickButton(editroom);
    }

    public void clicksubmiteditroom() {
        CommonEvents.scrollComponent(submiteditroom, webDriver);
        CommonEvents.clickButton(submiteditroom);
    }

    public void clicksearchrooms() {
        CommonEvents.scrollComponent(searroom, webDriver);
        CommonEvents.clickButton(searroom);
    }

    public void setsearchrooms(String searoom) {
        CommonEvents.scrollComponent(searchroom, webDriver);
        CommonEvents.setInputField(searchroom, searoom);

    }

    public void clickgo() {
        CommonEvents.clickButton(gosearchroom);
    }
    public void clickdeleteroom() {
        CommonEvents.forceWait(5000);
        CommonEvents.scrollComponentUP(deleteroom, webDriver);
        CommonEvents.clickButton(deleteroom);
    }

    public void clickaceptalert() {
        CommonEvents.popdialogacept();
    }


}
