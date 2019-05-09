package org.umssdiplo.automationv01.core.managepage.Module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Module extends BasePage {
    @FindBy(xpath = "//*[@id=\"moduleStatus\"]")
    private WebElement moduleenabled;
    @FindBy(xpath = "//*[@id='social-sidebar-menu']/li[3]/a")
    private WebElement modules;
    @FindBy(xpath = "//*[@id='smartAlertButtons']/div[1]")
    private WebElement enabled;


    public void clickenabledbtn() {

        CommonEvents.clickButton(moduleenabled);
    }

    public void clickmodule() {

        CommonEvents.clickButton(modules);
    }

    public void clickenabled() {

        CommonEvents.clickButton(enabled);
    }


}
