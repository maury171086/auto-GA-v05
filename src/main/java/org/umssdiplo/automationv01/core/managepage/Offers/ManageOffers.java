package org.umssdiplo.automationv01.core.managepage.Offers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ManageOffers extends BasePage {

    @FindBy(css = "a[href=\"#SPECIAL_OFFERS\"]")
    private WebElement menuSelectOffer;

    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/offers/\"]")
    private WebElement subMenuOffersManager;

    @FindBy(css = "button[class=\"btn btn-success\"][type=\"submit\"]")
    private WebElement buttonAdd;
    //llenando datos en el formulario Manage Offers
    @FindBy(css = "select[name=\"offerstatus\"]")
    private WebElement selectStatusAdd;
    @FindBy(css = "input[name=\"offertitle\"]")
    private WebElement inputOfferTitleAdd;
    @FindBy(css = "input[name=\"offerphone\"]")
    private WebElement inputOfferPhoneAdd;
    @FindBy(css = "input[name=\"offeremail\"]")
    private WebElement inputOfferEmailAdd;
    @FindBy(css = "input[name=\"offerprice\"]")
    private WebElement inputOfferPriceAdd;
    @FindBy(css = "input[name=\"ofrom\"]")
    private WebElement inputOfferOFromAdd;
    @FindBy(css = "input[name=\"oto\"]")
    private WebElement inputOfferOToAdd;
    // Begin textArea
    @FindBy(css = "textarea[name=\"offerdesc\"]")
    private WebElement textAreaOfferDesAdd;
    // End TextArea
    @FindBy(css = "button[id=\"add\"]")
    private WebElement buttonSubmitAdd;


    public ManageOffers clickMenuOffer(){
        CommonEvents.scrollComponent(menuSelectOffer,webDriver);
        CommonEvents.clickButton(menuSelectOffer);
        return this;
    }

    public ManageOffers clicksubMenuOffersManager(){
        CommonEvents.clickButton(subMenuOffersManager);
        return this;
    }

    public ManageOffers clickButtonAdd(){
        CommonEvents.clickButton(buttonAdd);
        return this;
    }

    public ManageOffers setSelectStatusAdd(String status){
        CommonEvents.selectOption(selectStatusAdd,status);
        return this;
    }

    public ManageOffers setInputOfferTitleAdd(String title){
        CommonEvents.setInputField(inputOfferTitleAdd,title);
        return this;
    }
    public ManageOffers setInputOfferPhoneAdd(String phone) {
        CommonEvents.setInputField(inputOfferPhoneAdd,phone);
        return this;
    }
    public ManageOffers setInputOfferEmailAdd(String emal) {
        CommonEvents.setInputField(inputOfferEmailAdd,emal);
        return this;
    }

    public ManageOffers setInputOfferPriceAdd(String price) {
        CommonEvents.forceWait(6000);
        CommonEvents.setInputField(inputOfferPriceAdd,price);
        return this;
    }

    public ManageOffers setInputOfferOFromAdd(String dateFrom) {
        CommonEvents.setInputField(inputOfferOFromAdd,dateFrom);
        return this;
    }
    public ManageOffers setInputOfferOToAdd(String dateTo) {
        CommonEvents.setInputField(inputOfferOToAdd,dateTo);
        CommonEvents.clickButton(inputOfferOToAdd);
        return this;
    }
    // insertando descripcion
    public ManageOffers setTextAreaDescripcionAdd(String descri) {
        CommonEvents.scrollComponent(buttonSubmitAdd,webDriver);
        //CommonEvents.setInputField(textAreaOfferDesAdd,descri);
        return this;
    }
    public ManageOffers clickButtonSubmitAdd(){
        CommonEvents.clickButton(buttonSubmitAdd);
        return this;
    }
}
