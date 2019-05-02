package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Modules.Module;

public class StepsDefinitionModules {
    Dashboard dashboard = new Dashboard();
    Module module;

    @Given("press button modules")
    public void pressButtonModules() {
        module = new Module();
        dashboard.pressButtonModules();
    }

    @And("press button DISABLED HOTELS")
    public void pressButtonDisabledHotels() {
        module.disabledHotels();
    }

    @And("press button ENABLED HOTELS")
    public void pressButtonEnabledHotels() {
        module.enabledHotels();
    }

    @And("press button DISABLED BLOG")
    public void pressButtonDisabledBlog() {
        module.disabledBlog();
    }

    @And("press button ENABLED BLOG")
    public void pressButtonEnabledBlog() {
        module.enabledBlog();
    }

    @And("acept the confirm disable module")
    public void pressButtonAceptDisabledModuleHotels() {
        module.aceptDisabledModuleHotels();
    }
}
