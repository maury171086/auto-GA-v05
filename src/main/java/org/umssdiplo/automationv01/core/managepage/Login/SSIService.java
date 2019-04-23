package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

//import static org.umssdiplo.automationv01.core.utils.c.*;

public class SSIService extends BasePage {
    public static final String MYPATH_INPUT_CONTAINS_TEXT_S = "//mypath/input[contains(text(), '%s')]";
    //    @FindBy(name = "email")
    @FindBy(xpath = "//input[@type='text']")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    @FindBy(id = "qa-test-lightbox-login")
    private WebElement registrarMaquinariaTab;

    @FindBy(id = "moduleStatus")
    private WebElement muduleenabled;

    @FindBy(xpath = "//*[@id='social-sidebar-menu']/li[3]/a")
    private WebElement module;

    @FindBy(xpath = "//*[@id='smartAlertButtons']/div[1]")
    private WebElement enabled;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    // public void eliminarRegistro(String abc) {
    //     CommonEvents.clickButton(elementoSelect);

    //     By by = By.xpath(String.format(MYPATH_INPUT_CONTAINS_TEXT_S, abc));
    //     CommonEvents.clickElement(by);
    // }

//    public RegistrarMarquinaria clickRegistrarMaquinariTab() {
//        clickButton(registrarMaquinariaTab);
//        return new RegistrarMarquinaria();
//    }
public void clickenabledbtn() {
    CommonEvents.clickButton(muduleenabled);
}

    public void clickmodule() {
        CommonEvents.clickButton(module);
    }

    public void clickenabled() {
        CommonEvents.clickButton(enabled);
    }
}
