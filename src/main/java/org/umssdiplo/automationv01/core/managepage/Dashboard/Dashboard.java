package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class Dashboard extends BasePage {

    @FindBy(id = "social-sidebar-menu")
    private WebElement botonDashboard;

    @FindBy(xpath = "//*[@id=\"nav\"]/ul[1]/a/button")
    private WebElement botonWebsite;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/button")
    private WebElement botonQuickBook;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[2]/form/button")
    private WebElement botonBooking;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[3]/form/button")
    private WebElement botonCmsPages;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[4]/form/button")
    private WebElement botonBlog;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[5]/form/button")
    private WebElement botonNewsletter;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[6]/form/button")
    private WebElement botonBackup;

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[5]")
    private WebElement botonAccounts;

    @FindBy(xpath = "//*[@id=\"ACCOUNTS\"]/li[1]")
    private WebElement botonAdmins;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement botonAddUsuario;


    public void displayPageDashboard() {
        CommonEvents.clickButton(botonDashboard);
    }

    public void addressPageWebsite() {
        CommonEvents.clickButton(botonWebsite);
        LoadPage.backPagePhpTravels();
    }

    public void displayQuickBooking() {
        CommonEvents.clickButton(botonQuickBook);
        LoadPage.backPagePhpTravels();
    }

    public void displayTableBooking() {
        CommonEvents.clickButton(botonBooking);
        LoadPage.backPagePhpTravels();
    }

    public void displayCmsPages() {
        CommonEvents.clickButton(botonCmsPages);
        LoadPage.backPagePhpTravels();
    }

    public void displayBlog() {
        CommonEvents.clickButton(botonBlog);
        LoadPage.backPagePhpTravels();
    }

    public void displayNewsletter() {
        CommonEvents.clickButton(botonNewsletter);
        LoadPage.backPagePhpTravels();
    }

    public void displayBackup() {
        CommonEvents.clickButton(botonBackup);
        LoadPage.backPagePhpTravels();
    }


    public void displayAdminsManagement() {
        CommonEvents.clickButton(botonAccounts);
        CommonEvents.clickButton(botonAdmins);
        CommonEvents.clickButton(botonAddUsuario);

    }
}
