package org.umssdiplo.automationv01.core.managepage.Login;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;
import java.util.Map;

//import static org.umssdiplo.automationv01.core.utils.c.*;

public class Login extends BasePage {
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

    @FindBy(xpath = "")
    private WebElement elementoSelect;

    @FindBy(id = "aaaa")
    private WebElement crearProductBtn;

    public void setCredentials(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        String username = (list.get(0).get("username"));
        String password = (list.get(0).get("password"));
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    public void eliminarRegistro(String abc) {
        CommonEvents.clickButton(elementoSelect);

        By by = By.xpath(String.format(MYPATH_INPUT_CONTAINS_TEXT_S, abc));
        CommonEvents.clickElement(by);
    }

    public Login setProductsWithDataTables() {
        CommonEvents.clickButton(crearProductBtn);
        CommonEvents.forceWait(1000);

        return this;

    }

//    public RegistrarMarquinaria clickRegistrarMaquinariTab() {
//        clickButton(registrarMaquinariaTab);
//        return new RegistrarMarquinaria();
//    }
}
