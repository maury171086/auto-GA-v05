package org.umssdiplo.automationv01.core.managepage.Airport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class Airport extends BasePage {

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[8]/a")
    private WebElement menuflight;
    @FindBy(xpath = "//*[@id=\"Flights\"]/li[2]/a")
    private WebElement submenuairpots;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a")
    private WebElement addairports;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/input")
    private WebElement codair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/input")
    private WebElement namair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div/input")
    private WebElement codcitair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input")
    private WebElement namcitair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[5]/div/input")
    private WebElement namcouair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[6]/div/input")
    private WebElement codcouair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[7]/div/input")
    private WebElement timzonair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[8]/div/input")
    private WebElement latair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[9]/div/input")
    private WebElement logair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[10]/div/input")
    private WebElement citair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a[1]")
    private WebElement saveair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/a")
    private WebElement searchair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/input")
    private WebElement searair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/span/a")
    private WebElement gosearch;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[13]/span/a[2]")
    private WebElement editair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/span[1]/span/a[2]")
    private WebElement resetair;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[13]/span/a[3]")
    private WebElement deleteair;

    public void clickaceptalert() {
        CommonEvents.popdialogacept();
    }

    public void clickmenuflight() {
        CommonEvents.clickButton(menuflight);
    }

    public void clicksubmenuairports() {
        CommonEvents.clickButton(submenuairpots);
    }

    public void clickaddairports() {
        CommonEvents.forceWait(5000);
        CommonEvents.scrollComponentUP(addairports, webDriver);
        CommonEvents.clickButton(addairports);
    }

    public void setcodigoair(String codeair) {
        CommonEvents.setInputField(codair, codeair);

    }

    public void setnameair(String nameair) {
        CommonEvents.setInputField(namair, nameair);
    }

    public void setcodcity(String codecityair) {
        CommonEvents.setInputField(codcitair, codecityair);
    }

    public void setnamecity(String namecityair) {
        CommonEvents.setInputField(namcitair, namecityair);
    }

    public void setnamecountry(String namecountryair) {

        CommonEvents.setInputField(namcouair, namecountryair);
    }

    public void setcodecountry(String codecountryair) {
        CommonEvents.setInputField(codcouair, codecountryair);
    }

    public void settimezone(String timezoneair) {
        CommonEvents.setInputField(timzonair, timezoneair);
    }

    public void setlatitud(String latitudair) {
        CommonEvents.scrollComponent(latair, webDriver);
        CommonEvents.setInputField(latair, latitudair);
    }

    public void setlongitud(String longitudair) {
        CommonEvents.scrollComponent(logair, webDriver);
        CommonEvents.setInputField(logair, longitudair);
    }

    public void setcity(String cityair) {
        CommonEvents.scrollComponent(citair, webDriver);
        CommonEvents.setInputField(citair, cityair);
    }

    public void clicksaveair() {
        CommonEvents.scrollComponentUP(saveair, webDriver);
        CommonEvents.clickButton(saveair);
    }

    public void clicksearchair() {
        CommonEvents.scrollComponent(searchair, webDriver);
        CommonEvents.clickButton(searchair);
    }

    public void setsearchair(String seaair) {
        CommonEvents.scrollComponent(searair, webDriver);
        CommonEvents.setInputField(searair, seaair);

    }

    public void clickgo() {
        CommonEvents.clickButton(gosearch);
    }

    public void clickeditair() {
        CommonEvents.forceWait(5000);
        CommonEvents.scrollComponentUP(editair, webDriver);
        CommonEvents.clickButton(editair);
    }

    public void clickresetair() {
        CommonEvents.clickButton(resetair);
    }


    public void clickdeleteair() {
        CommonEvents.forceWait(5000);
        CommonEvents.scrollComponentUP(deleteair, webDriver);
        CommonEvents.clickButton(deleteair);
    }
}
