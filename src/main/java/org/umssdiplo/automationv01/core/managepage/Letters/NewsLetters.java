package org.umssdiplo.automationv01.core.managepage.Letters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class NewsLetters extends BasePage {

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[15]/a")
    private WebElement clickNewsLetters;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/form/button")
    private WebElement clickBittonSendNewsLetters;
    @FindBy(css = "select2-input")
    private WebElement selectSendTo;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div[1]/div[2]/fieldset/div/div[2]/input")
    private WebElement setSubject;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div[1]/div[2]/fieldset/div/div[3]/button")
    private WebElement buttonSend;

    public void clickNewsLettersMenu(){
        CommonEvents.clickButton(clickNewsLetters);
    }
    public void clickSendNewsLetters(){
        CommonEvents.clickButton(clickBittonSendNewsLetters);
    }
    public NewsLetters selectSendTo(String send_to){
        CommonEvents.selectOption(selectSendTo, send_to);
        return this;
    }
    public NewsLetters insertSubject(String subject){
        CommonEvents.setInputField(setSubject, subject);
        return this;
    }
    public void clickSend(){
        CommonEvents.clickButton(buttonSend);
    }

}
