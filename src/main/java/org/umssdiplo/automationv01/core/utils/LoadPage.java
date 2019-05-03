package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Blog.BlogsCategories;
import org.umssdiplo.automationv01.core.managepage.Blog.Posts;
import org.umssdiplo.automationv01.core.managepage.Bookings.Bookings;
import org.umssdiplo.automationv01.core.managepage.Cars.Cars;
import org.umssdiplo.automationv01.core.managepage.Coupons.Coupons;
import org.umssdiplo.automationv01.core.managepage.Letters.NewsLetters;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Offers.ManageOffers;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersSettings;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static void backPagePhpTravels() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
    }

    public static Cars CarsPage() {
        return new Cars();
    }
    public static Posts postsPage(){
        return new Posts();
    }
    public static BlogsCategories blogsCategoriesPage(){
        return new BlogsCategories();

    }

    public static ManageOffers offersManagePage(){
        return new ManageOffers();
    }

    public static OffersSettings offersSettingsPage(){
        return new OffersSettings();
    }
    public static Coupons couponsPage(){
        return new Coupons();
    }
    public static NewsLetters newsLettersPage(){
        return new NewsLetters();
    }
    public static Bookings bookingsPage(){
        return new Bookings();
    }

}
