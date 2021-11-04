package pages;


import framework.config.Settings;


import static framework.base.DriverContext.driver;

public class LandingPage {

    public void launchBaseUrl(){

        driver.get(Settings.NhsCostingServiceURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
}