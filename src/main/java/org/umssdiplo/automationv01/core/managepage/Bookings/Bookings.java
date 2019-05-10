package org.umssdiplo.automationv01.core.managepage.Bookings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Bookings extends BasePage {
    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[16]/a")
    private WebElement menuBooking;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[10]/td[12]/span/a[2]/i")
    private WebElement buttonEdit;
    @FindBy(name = "status")
    private WebElement opctionBookingsStatus;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[1]/form/div[3]/div/input[2]")
    private WebElement buttonUpdateBooking;

    public void clickMenuBookings() {
        CommonEvents.clickButton(menuBooking);
    }

    public void clickBottonEdit() {
        CommonEvents.clickButton(buttonEdit);
    }

    public Bookings selectBookingStatus(String booking_Status) {
        CommonEvents.selectOption(opctionBookingsStatus, booking_Status);
        return this;
    }

    public void clickUpdateBooking() {
        CommonEvents.clickButton(buttonUpdateBooking);
    }
}
