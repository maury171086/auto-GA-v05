package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;

public class StepsDefinitionDashboard {

    Dashboard dashboard = new Dashboard();

    @Given("^press button DASHBOAR page main dashboard$")
    public void seCargoPaginaPrincipal() throws Throwable {
        dashboard.displayPageDashboard();
    }

    @And("^press button website page main dashboard$")
    public void pressBotonWebSite() throws Throwable {
        dashboard.addressPageWebsite();
    }

    @And("^press button quickbook page main dashboard$")
    public void pressBotonQuickBook() throws Throwable {
        dashboard.displayQuickBooking();
    }

    @And("^press button bookings page main dashboard$")
    public void pressBotonBookings() throws Throwable {
        dashboard.displayTableBooking();
    }

    @And("^press button cmsPages page main dashboard$")
    public void pressBotonCmsPages() throws Throwable {
        dashboard.displayCmsPages();
    }

    @And("^press button blog page main dashboard$")
    public void pressBotonBlog() throws Throwable {
        dashboard.displayBlog();
    }

    @And("^press button newsletter page main dashboard$")
    public void pressBotonNewsletter() throws Throwable {
        dashboard.displayNewsletter();
    }

    @And("^press button backup page main dashboard$")
    public void pressBotonBackup() throws Throwable {
        dashboard.displayBackup();
    }
}
