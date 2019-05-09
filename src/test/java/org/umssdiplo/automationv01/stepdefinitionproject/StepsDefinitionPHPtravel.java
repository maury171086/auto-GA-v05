package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Airport.Airport;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Module.Module;
import org.umssdiplo.automationv01.core.managepage.Room.Room;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Room room;
    private Module module;
    private Airport airport;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^fill credentials on 'Login' data$")
    public void fillCredentialsOnLoginData(DataTable dt) {
        login.setCredentials(dt);

    }

    @And("^click en Menu 'Module' en pagina home$")
    public void clickOnModule() throws Throwable {
        module.clickmodule();
    }

    @And("^click en 'Enabled/Disabled module' en pagina module$")
    public void clickOnEnabledModule() throws Throwable {
        module.clickenabledbtn();
    }

    @And("^click en 'Enabled/Disabled' en alert$")
    public void clickOnEnabled() throws Throwable {
        module.clickenabled();
    }

    @And("^Click en Menu 'Hotels' en pagina home$")
    public void clickEnMenuHOTELSEnPaginaHome() throws Throwable {
        room.clickmenuhotel();
    }

    @And("^Click en SubMenu 'Rooms' en pagina Hotels$")
    public void clickEnSubMenuRoomsEnPaginaHotels() throws Throwable {
        room.clicksubmenuroom();
    }

    @And("^Click en 'ADD' en pagina Rooms$")
    public void clickEnADDEnPaginaRooms() throws Throwable {
        room.clickaddroom();
    }

    @And("^Select Status \"([^\"]*)\" en formulario add Rooms$")
    public void selectStatusEnFormularioAddRooms(String status) throws Throwable {
        room.setstatusroom(status);
    }

    @And("^Select Room Type \"([^\"]*)\" en formulario add Rooms$")
    public void selectRoomTypeEnFormularioAddRooms(String roomtype) throws Throwable {
        room.setroomtype(roomtype);
    }

    @And("^Select Hotel \"([^\"]*)\" en formulario add Rooms$")
    public void selectHotelEnFormularioAddRooms(String hotel) throws Throwable {
        room.sethotel(hotel);
    }

    @And("^Insert descripcion Room \"([^\"]*)\" en formulario add Rooms$")
    public void insertDescripcionRoomEnFormularioAddRooms(String descrip) throws Throwable {
        room.setdescription(descrip);
    }

    @And("^Insert precio \"([^\"]*)\" en formulario add Rooms$")
    public void insertPrecioEnFormularioAddRooms(String precio) throws Throwable {
        room.setprice(precio);
    }

    @And("^Insert cantidad \"([^\"]*)\" en formulario add Rooms$")
    public void insertCantidadEnFormularioAddRooms(String cantidad) throws Throwable {
        room.setcantidad(cantidad);
    }

    @And("^Insert Minimum Stay \"([^\"]*)\" en formulario add Rooms$")
    public void insertMinimumStayEnFormularioAddRooms(String minstay) throws Throwable {
        room.setminimunstay(minstay);
    }

    @And("^Insert Max Adults \"([^\"]*)\" en formulario add Rooms$")
    public void insertMaxAdultsEnFormularioAddRooms(String maxadul) throws Throwable {
        room.setmaxadults(maxadul);
    }

    @And("^Insert Max Children \"([^\"]*)\" en formulario add Rooms$")
    public void insertMaxChildrenEnFormularioAddRooms(String maxchil) throws Throwable {
        room.setmaxchildren(maxchil);
    }

    @And("^Insert Num of Extra Beds \"([^\"]*)\" en formulario add Rooms$")
    public void insertNumOfExtraBedsEnFormularioAddRooms(String extrabeds) throws Throwable {
        room.setnumextrabeds(extrabeds);
    }

    @And("^Insert Extra Bed Charges \"([^\"]*)\" en formulario add Rooms$")
    public void insertExtraBedChargesEnFormularioAddRooms(String bedscharges) throws Throwable {
        room.setextrabedcharges(bedscharges);
    }

    @And("^Click 'SUBMIT' en formulario add Rooms$")
    public void clickSUBMITEnFormularioAddRooms() {
        room.clicksubmitnewroom();
    }

    @And("^Click en 'EDIT' en pagina Rooms$")
    public void clickEnEDITEnPaginaRooms() {
        room.clickeditroom();
    }

    @And("^Click 'SUBMIT' en formulario edit Rooms$")
    public void clickSUBMITEnFormularioEditRooms() {
        room.clicksubmiteditroom();
    }

    @And("^Click 'Delete' en pagina Rooms$")
    public void clickDeleteEnPaginaRooms() {
        room.clickdeleteroom();
    }

    @And("^Click en 'SEARCH' en pagina Rooms$")
    public void clickEnSEARCHEnPaginaRooms() {
        room.clicksearchrooms();
    }

    @And("^Insert air search \"([^\"]*)\" en pagina Rooms$")
    public void insertAirSearchEnPaginaRoomss(String searoom) throws Throwable {
        room.setsearchrooms(searoom);
    }

    @And("^Click en 'GO' en pagina Rooms$")
    public void clickEnGOEnPaginaRooms() {
        room.clickgo();
    }

    @And("^Click 'Acept' en alert en pagina Rooms$")
    public void clickAceptEnAlert() {
        room.clickaceptalert();
    }

    @And("^Click en Menu 'Flight' en pagina home$")
    public void clickEnMenuFlightEnPaginaHome() {
        airport.clickmenuflight();

    }

    @And("^Click en SubMenu 'Airports' en pagina Flight$")
    public void clickEnSubMenuAirportsEnPaginaFlight() {
        airport.clicksubmenuairports();

    }

    @And("^Click en 'ADD' en pagina Airports$")
    public void clickEnADDEnPaginaAirports() {
        airport.clickaddairports();

    }

    @And("^Insert codigo \"([^\"]*)\" en formulario add Airports$")
    public void insertCodigoEnFormularioAddAirports(String codeair) throws Throwable {
        airport.setcodigoair(codeair);
    }

    @And("^Insert nombre \"([^\"]*)\" en formulario add Airports$")
    public void insertNombreEnFormularioAddAirports(String nameair) throws Throwable {
        airport.setnameair(nameair);
    }

    @And("^Insert codigo ciudad \"([^\"]*)\" en formulario add Airports$")
    public void insertCodigoCiudadEnFormularioAddAirports(String codecityair) throws Throwable {
        airport.setcodcity(codecityair);

    }

    @And("^Insert nombre ciudad \"([^\"]*)\" en formulario add Airports$")
    public void insertNombreCiudadEnFormularioAddAirports(String namecityair) throws Throwable {
        airport.setnamecity(namecityair);

    }

    @And("^Insert nombre pais \"([^\"]*)\" en formulario add Airports$")
    public void insertNombrePaisEnFormularioAddAirports(String namecountryair) throws Throwable {
        airport.setnamecountry(namecountryair);
    }

    @And("^Insert codigo pais \"([^\"]*)\" en formulario add Airports$")
    public void insertCodigoPaisEnFormularioAddAirports(String codecounair) throws Throwable {
        airport.setcodecountry(codecounair);
    }

    @And("^Insert zona horaria \"([^\"]*)\" en formulario add Airports$")
    public void insertZonaHorariaEnFormularioAddAirports(String timezoneair) throws Throwable {
        airport.settimezone(timezoneair);
    }

    @And("^Insert latitud \"([^\"]*)\" en formulario add Airports$")
    public void insertLatitudEnFormularioAddAirports(String latitudair) throws Throwable {
        airport.setlatitud(latitudair);
    }

    @And("^Insert longitud \"([^\"]*)\" en formulario add Airports$")
    public void insertLongitudEnFormularioAddAirports(String longitudair) throws Throwable {
        airport.setlongitud(longitudair);
    }

    @And("^Insert ciudad \"([^\"]*)\" en formulario add Airports$")
    public void insertCiudadEnFormularioAddAirports(String cityair) throws Throwable {
        airport.setcity(cityair);
    }

    @And("^Click 'SAVE & RETURN' en formulario add Airports$")
    public void clickSAVERETURNEnFormularioAddAirports() {
        airport.clicksaveair();
    }

    @And("^Click en 'SEARCH' en pagina Airports$")
    public void clickEnSEARCHEnPaginaAirports() {
        airport.clicksearchair();
    }

    @And("^Insert air search \"([^\"]*)\" en pagina Airports$")
    public void insertAirSearchEnPaginaAirports(String seaair) throws Throwable {
        airport.setsearchair(seaair);
    }

    @And("^Click en 'GO' en pagina Airports$")
    public void clickEnGOEnPaginaAirports() {
        airport.clickgo();
    }

    @And("^Click en 'EDIT' en pagina Airports$")
    public void clickEnEDITEnPaginaAirports() {
        airport.clickeditair();
    }

    @And("^Click 'SAVE & RETURN' en formulario edit Airports$")
    public void clickSAVERETURNEnFormularioEditAirports() {
        airport.clicksaveair();
    }

    @And("^Click 'RESET' en pagina Airports$")
    public void clickRESETEnPaginaAirports() {
        airport.clickresetair();
    }


    @And("^Click en 'Delete' en pagina Airports$")
    public void clickEnDeleteEnPaginaAirports() {
        airport.clickdeleteair();
    }

    @Given("^'PHP travel Menu Rooms' page is loaded$")
    public void phpTravelMenuRoomsPageIsLoaded() {
        room = LoadPage.roomPage();
    }

    @Given("^'PHP travel Menu Airports' page is loaded$")
    public void phpTravelMenuAirportsPageIsLoaded() {
        airport = LoadPage.airportsPage();
    }

    @Given("^'PHP travel Menu Module' page is loaded$")
    public void phpTravelMenuModulePageIsLoaded() {
        module = LoadPage.modulePage();
    }

    @And("^Click 'Acept' en alert en pagina Airports$")
    public void clickAceptEnAlertEnPaginaAirports() {
        airport.clickaceptalert();
    }
}
