package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Blog.BlogsCategories;
import org.umssdiplo.automationv01.core.managepage.Blog.Posts;
import org.umssdiplo.automationv01.core.managepage.Bookings.Bookings;
import org.umssdiplo.automationv01.core.managepage.Cars.Cars;
import org.umssdiplo.automationv01.core.managepage.Coupons.Coupons;
import org.umssdiplo.automationv01.core.managepage.Letters.NewsLetters;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Offers.ManageOffers;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersSettings;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private ManageOffers manageOffers;
    private OffersSettings offersSettings;
    private Posts posts;
    private BlogsCategories blogsCategories;
    private Coupons coupons;
    private NewsLetters newsLetters;
    private Bookings bookings;
    private Cars cars;


    //Manage Offers
    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^fill credentials on 'Login' data$")
    public void fillCredentialsOnLoginData(DataTable dt) {

        login.setCredentials(dt);
    }

    // step deffinitions OFFERS
    @Given("^'PHP travel section Manage Offers' page is loaded$")
    public void phpTravelSectionManageOffersPageIsLoaded() {
        manageOffers = LoadPage.offersManagePage();
    }

    @And("^Click en el Menu 'OFFERS MANAGE' in home menu$")
    public void clickEnElMenuOFFERSMANAGEInHomeMenu() {
        manageOffers.clickMenuOffer();
    }

    @And("^Click en el Sub Menu 'Manage Offers' in home menu$")
    public void clickEnElSubMenuManageOffersInHomeMenu() {
        manageOffers.clicksubMenuOffersManager();
    }

    @And("^Click Button 'ADD' in page offers manage$")
    public void clickButtonADDInPageOffersManage() {
        manageOffers.clickButtonAdd();
    }

    @And("^Select \"([^\"]*)\" in form offers manager Add$")
    public void selectInFormOffersManagerAdd(String status) throws Throwable {
        manageOffers.setSelectStatusAdd(status);
    }

    @And("^Insert input Title \"([^\"]*)\" in form offers manager Add$")
    public void insertInputTitleInFormOffersManagerAdd(String title) throws Throwable {
        manageOffers.setInputOfferTitleAdd(title);
    }

    @And("^Insert input Phone \"([^\"]*)\" in form offers manager Add$")
    public void insertInputPhoneInFormOffersManagerAdd(String phone) throws Throwable {
        manageOffers.setInputOfferPhoneAdd(phone);
    }

    @And("^Insert input Email \"([^\"]*)\" in form offers manager Add$")
    public void insertInputEmailInFormOffersManagerAdd(String email) throws Throwable {
        manageOffers.setInputOfferEmailAdd(email);
    }

    @And("^Insert input Price \"([^\"]*)\" in form offers manager Add$")
    public void insertInputPriceInFormOffersManagerAdd(String price) throws Throwable {
        manageOffers.setInputOfferPriceAdd(price);
    }

    @And("^Data Time From \"([^\"]*)\" in form offers manager Add$")
    public void dataTimeFromInFormOffersManagerAdd(String dataFrom) throws Throwable {
        manageOffers.setInputOfferOFromAdd(dataFrom);
    }

    @And("^Data Time To \"([^\"]*)\" in form offers manager Add$")
    public void dataTimeToInFormOffersManagerAdd(String dataTo) throws Throwable {

        manageOffers.setInputOfferOToAdd(dataTo);

    }

    @And("^Insert TextArea \"([^\"]*)\" in form offers manager Add$")
    public void insertTextAreaInFormOffersManagerAdd(String descri) throws Throwable {
        manageOffers.setTextAreaDescripcionAdd(descri);
    }

    @And("^Click Button 'SUBMIT' in form offers manager Add$")
    public void clickButtonSUBMITInFormOffersManagerAdd() {
        manageOffers.clickButtonSubmitAdd();
    }

    // offers Setings
    @Given("^'PHP travels section Offers' page is loaded$")
    public void phpTravelsSectionOffersPageIsLoaded() {
        offersSettings = LoadPage.offersSettingsPage();
    }


    @And("^Click in Menu 'OFFERS' in home menu$")
    public void clickInMenuOFFERSInHomeMenu() {
        offersSettings.clickMenuOffer();
    }

    @And("^Click in Sub Menu 'OFFERS SETTINGS' in home sub menu$")
    public void clickInSubMenuOFFERSSETTINGSInHomeSubMenu() {
        offersSettings.clickSubMenuOfferSetting();
    }

    @And("^Insert Target \"([^\"]*)\" in form Offer Setiing$")
    public void insertTargetInFormOfferSetiing(String target) throws Throwable {
        offersSettings.setSelectTarget(target);
    }

    @And("^Insert Page Title \"([^\"]*)\" in form Offer Setiing$")
    public void insertPageTitleInFormOfferSetiing(String page_Title) throws Throwable {
        offersSettings.setInputPageTitle(page_Title);
    }

    @And("^Insert Listings Page \"([^\"]*)\" in form Offer Setiing$")
    public void insertListingsPageInFormOfferSetiing(String listings_Page) throws Throwable {
        offersSettings.setInputListingsPage(listings_Page);
    }


    @And("^Click 'SUBMIT' in for Offers Setting$")
    public void clickSUBMITInForOffersSetting() {
        offersSettings.clickButtonSubmit();
    }
    // step Deffinitions BLOG
        // POSTS
    @Given("^'PHP travels section Blog' page is loaded$")
    public void phpTravelsSectionBlogPageIsLoaded() {
        blogsCategories =LoadPage.blogsCategoriesPage();
    }

    @And("^Click Menu 'BLOG' in home menu$")
    public void clickMenuBLOGInHomeMenu() {
        blogsCategories.ClickMenuBlog();
    }

    @And("^Click Sub Menu 'POSTS' in home Sub Menu$")
    public void clickSubMenuPOSTSInHomeSubMenu() {
        posts.ClickSubMenuPosts();
    }

    @And("^Click button 'ADD' in page Blog$")
    public void clickButtonADDInPageBlog() {
        posts.ClickButtonAddPosts();
    }

    @And("^Insert imput Post Title \"([^\"]*)\" in form Add Posts$")
    public void insertImputPostTitleInFormAddPosts(String title_Posts) throws Throwable {
        posts.InsertTitlePosts(title_Posts);
    }

    @And("^Insert imput Area Text \"([^\"]*)\" in form Text$")
    public void insertImputAreaTextInFormText(String text_Area) throws Throwable {
        posts.InsertText(text_Area);
    }

    @And("^Select \"([^\"]*)\" in form posts$")
    public void selectInFormPosts(String status) throws Throwable {
        posts.SelectStatus(status);
    }

    @And("^Select \"([^\"]*)\" in form$")
    public void selectInForm(String category) throws Throwable {
        posts.SelectCategory(category);
    }

    @And("^Click Button 'SUBMIT' in form posts add$")
    public void clickButtonSUBMITInFormPostsAdd() {
        posts.ClickSumbitPosts();
    }
    // blog categories
    @And("^Click Sub Menu 'BLOG CATEGORIES' in home Sub Menu$")
    public void clickSubMenuBLOGCATEGORIESInHomeSubMenu() {
        blogsCategories.clickButtonBlogsCategories();

    }
    @And("^Click Sub Menu 'BLOG CATEGORIES'$")
    public void clickSubMenuBLOGCATEGORIES() {
        blogsCategories.clickSubMenuBlogCategories();
    }

    @And("^Click button 'ADD' in form Blog Categories$")
    public void clickButtonADDInFormBlogCategories() {
        blogsCategories.clickButtonAddBlogCategories();

    }

    @And("^Insert imput Category Name \"([^\"]*)\" in form$")
    public void insertImputCategoryNameInForm(String categories_Name) throws Throwable {
        blogsCategories.imputCategoriesNameBlog(categories_Name);
    }

    @And("^Select \"([^\"]*)\" in form Blog Cateories$")
    public void selectInFormBlogCateories(String status) throws Throwable {
        blogsCategories.selectStatusBlogCategories(status);
    }

    @And("^Insert imput Name in Spanish \"([^\"]*)\" in form$")
    public void insertImputNameInSpanishInForm(String name_in_Spanich) throws Throwable {
        blogsCategories.imputNameInSpanich(name_in_Spanich);
    }

    @And("^Click Button 'ADD' in form$")
    public void clickButtonADDInForm() {
        blogsCategories.clickAddFormBlogCategories();
    }

    // Coupons step deffinitions
    @Given("^'PHP travels section Coupons' page is loaded$")
    public void phpTravelsSectionCouponsPageIsLoaded() {
        coupons = LoadPage.couponsPage();
    }

    @And("^Click in Menu 'COUPONS' in home menu$")
    public void clickInMenuCOUPONSInHomeMenu() {
        coupons.clickMenuCoupons();
    }

    @And("^Click in button'ADD' in page Coupons Code Management$")
    public void clickInButtonADDInPageCouponsCodeManagement() {
        coupons.clickAddCoupons();
    }

    @And("^Select status \"([^\"]*)\" in form Add Coupon Code$")
    public void selectStatusInFormAddCouponCode(String status_coupons) throws Throwable {
        coupons.selectStatusCoupons(status_coupons);
    }

    @And("^Insert percentaje \"([^\"]*)\" in Add form Coupon Code$")
    public void insertPercentajeInAddFormCouponCode(String percentaje_coupons) throws Throwable {
        coupons.insertPercentajeCoupons(percentaje_coupons);
    }

    @And("^Insert \"([^\"]*)\" in Add form Coupons Code$")
    public void insertInAddFormCouponsCode(String max_Uses) throws Throwable {
        coupons.insertMaxUses(max_Uses);
    }

    @And("^Click 'Star Date' in form Add Coupons Code$")
    public void clickStarDateInFormAddCouponsCode() {
        coupons.clickStartDate();
    }

    @And("^Click 'date ini' in text$")
    public void clickDateIniInText() {
        coupons.selectDateIni();
    }

    @And("^Click button 'Generate' code$")
    public void clickButtonGenerateCode() {
        coupons.clickButtonGenerateCode();
    }

    @And("^Click button 'SUBMIT' in form Add Coupons Code$")
    public void clickButtonSUBMITInFormAddCouponsCode() {
        coupons.clickSubmitFormCoupons();
    }
    //LETTERS Step deffinitions

    @Given("^'PHP travels secction NewsLetters' page is loaded$")
    public void phpTravelsSecctionNewsLettersPageIsLoaded() {
        newsLetters = LoadPage.newsLettersPage();
    }

    @And("^Click in menu 'NEWSLETTERS' in home page$")
    public void clickInMenuNEWSLETTERSInHomePage() {
        newsLetters.clickNewsLettersMenu();
    }

    @And("^Click Button 'SEND NEWSLETTERS' in form news letters$")
    public void clickButtonSENDNEWSLETTERSInFormNewsLetters() {
        newsLetters.clickSendNewsLetters();
    }

    @And("^Select \"([^\"]*)\" in form send newsletters$")
    public void selectInFormSendNewsletters(String send_to) throws Throwable {
        newsLetters.selectSendTo(send_to);
    }

    @And("^Insert \"([^\"]*)\" in form$")
    public void insertInForm(String subject) throws Throwable {
        newsLetters.insertSubject(subject);
    }

    @And("^click Button 'SEND' in form$")
    public void clickButtonSENDInForm() {
        newsLetters.clickSend();
    }
    //Bookings step deffinitions

    @Given("^'PHP travels secction Bookings' page is loaded$")
    public void phpTravelsSecctionBookingsPageIsLoaded() {
        bookings = LoadPage.bookingsPage();
    }

    @And("^Click in menu 'BOOKINGS' in home page$")
    public void clickInMenuBOOKINGSInHomePage() {
        bookings.clickMenuBookings();
    }

    @And("^Click button 'EDIT' in Booking page$")
    public void clickButtonEDITInBookingPage() {
        bookings.clickBottonEdit();
    }

    @And("^Select \"([^\"]*)\" in form Bookings$")
    public void selectInFormBookings(String booking_Status) throws Throwable {
        bookings.selectBookingStatus(booking_Status);
    }

    @And("^button 'UPDATE BOOKING' in form$")
    public void buttonUPDATEBOOKINGInForm() {
        bookings.clickUpdateBooking();
    }
    // step deffinition Cars
    //add
    @Given("^pagina 'php travels section Cars' page is load$")
    public void paginaPhpTravelsSectionCarsPageIsLoad() {
        cars = LoadPage.CarsPage();
    }

    @And("^click Sub Menu 'CARS' in home$")
    public void clickSubMenuCARSInHome() {
        cars.clickMenuCars();
    }

    @And("^click 'Cars' on home sub menu$")
    public void clickCarsOnHomeSubMenu() {
        cars.clickSubMenuCars();
    }

    @And("^click 'ADD' boton list$")
    public void clickADDBotonList() {
        cars.clickAddCars();
    }

    @And("^Insert \"([^\"]*)\" on form cars$")
    public void insertOnFormCars(String name_cars) throws Throwable {
        cars.InsertNameCars(name_cars);
    }

    @And("^click Button 'SUBMIT' boton$")
    public void clickButtonSUBMITBoton() {
        cars.clickButtonSubmitForm();
    }
    //delete
    @Given("^'PHP travels section Cars' page is loaded$")
    public void phpTravelsSectionCarsPageIsLoaded() {
        cars = LoadPage.CarsPage();
    }

    @And("^Click menu 'CARS' in home page$")
    public void clickMenuCARSInHomePage() {
        cars.clickMenuCars();
    }

    @And("^Click sub menu 'Cars' in home sub menu$")
    public void clickSubMenuCarsInHomeSubMenu() {
        cars.clickSubMenuCars();
    }

    @And("^Click button 'DELETE' in form Cars$")
    public void clickButtonDELETEInFormCars() {
        cars.clickDeleteCars();
    }
    // edit cars
    @Given("^'PHP travels sections Cars' page is loaded$")
    public void phpTravelsSectionsCarsPageIsLoaded() {
        cars = LoadPage.CarsPage();
    }

    @And("^Click in menu 'CARS' in home page$")
    public void clickInMenuCARSInHomePage() {
        cars.clickMenuCars();
    }

    @And("^Click  'CARS' on sub menu$")
    public void clickCARSOnSubMenu() {
        cars.clickSubMenuCars();
    }

    @And("^click 'EDIT' boton$")
    public void clickEDITBoton() {
        cars.clickBotonEditar();
    }

    @And("^Insert <\"([^\"]*)\"> on name cars form$")
    public void insertOnNameCarsForm(String name_cars_edit) throws Throwable {
        cars.InsertNameCarsEdit(name_cars_edit);
    }

    @And("^click 'SUBMIT' boton edit$")
    public void clickSUBMITBotonEdit() {
        cars.ClickSubmitEditNameCars();
    }


}
