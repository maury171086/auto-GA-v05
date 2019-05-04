package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Airport.Airport;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Module.Module;
import org.umssdiplo.automationv01.core.managepage.Room.Room;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static Room roomPage() {
        return new Room();
    }

    public static Airport airportsPage() {
        return new Airport();
    }

    public static Module modulePage() {
        return new Module();
    }
}
