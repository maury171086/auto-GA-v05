package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;

public class StepsDefinitionDashboard {

    Dashboard dashboard = new Dashboard();

    @Given("^press button dashboard$")
    public void seCargoPaginaPrincipal() throws Throwable {
        dashboard.displayPageDashboard();
    }

    @And("^press button website$")
    public void pressBotonWebSite() throws Throwable {
        dashboard.addressPageWebsite();
    }

    @And("^press button quickbook$")
    public void pressBotonQuickBook() throws Throwable {
        dashboard.displayQuickBooking();
    }

    @And("^press button bookings$")
    public void pressBotonBookings() throws Throwable {
        dashboard.displayTableBooking();
    }

    @And("^press button cmsPages$")
    public void pressBotonCmsPages() throws Throwable {
        dashboard.displayCmsPages();
    }

    @And("^press button blog$")
    public void pressBotonBlog() throws Throwable {
        dashboard.displayBlog();
    }

    @And("^press button newsletter$")
    public void pressBotonNewsletter() throws Throwable {
        dashboard.displayNewsletter();
    }

    @And("^press button backup$")
    public void pressBotonBackup() throws Throwable {
        dashboard.displayBackup();
    }
}
