package org.umssdiplo.automationv01.core.managepage.Coupons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Coupons extends BasePage {
    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[14]/a") //*[@id="social-sidebar-menu"]/li[14]/a
    private WebElement menuSelectCoupons;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[1]/button")
    private WebElement addCouponsCode;
    @FindBy(name = "status")
    private WebElement selectOptionStatus;
    @FindBy(id = "rate")
    private WebElement setPercentajeCoupons;
    @FindBy(id = "max")
    private WebElement setMaxUses;
    @FindBy(id = "startdate")
    private WebElement clickStarDate;
    @FindBy(xpath = "/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]")
    private WebElement clickDateIni;
    @FindBy(id = "add")
    private WebElement clickButtonGenerate;
    @FindBy(css = "btn btn-primary submitcoupon")
    private WebElement clickButtonSumbitCoupons;

    public void clickMenuCoupons(){
        CommonEvents.scrollComponent(menuSelectCoupons, webDriver);
        CommonEvents.clickButton(menuSelectCoupons);
    }
    public void clickAddCoupons(){
        CommonEvents.clickButton(addCouponsCode);
    }
    public Coupons selectStatusCoupons(String status_coupons){
        CommonEvents.selectOption(selectOptionStatus, status_coupons);
        return this;
    }
    public Coupons insertPercentajeCoupons(String percentaje_coupons){
        CommonEvents.setInputField(setPercentajeCoupons, percentaje_coupons);
        return this;
    }
    public Coupons insertMaxUses(String max_Uses){
        CommonEvents.setInputField(setMaxUses, max_Uses);
        return this;
    }
    public void clickStartDate(){
        CommonEvents.clickButton(clickStarDate);
    }
    public void selectDateIni(){
        CommonEvents.clickButton(clickDateIni);
    }

    public void clickButtonGenerateCode(){
        CommonEvents.clickButton(clickButtonGenerate);
    }
    public void clickSubmitFormCoupons(){
        CommonEvents.clickButton(clickButtonSumbitCoupons);
    }
}
