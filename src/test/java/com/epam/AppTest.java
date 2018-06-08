package com.epam;


import com.epam.entities.User;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.po.JdiSite;
import com.epam.utils.JavaPropertyLoader;
import com.epam.utils.MyConfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest extends TestNGBase {

    private MyConfig config;

    @BeforeSuite
    @SuppressWarnings("unchecked")
    public void beforeSuite() {
        WebSite.init(JdiSite.class);
        config = ConfigFactory.create(MyConfig.class);
    }

    @Test
    public void loginTest() {
        JdiSite.homePage.open();
        JdiSite.homePage.login(User.PETER);
        JdiSite.homePage.checkOpened();
        WebSettings.logger.info(String.format("my.property by owner: %s", config.myProperty()));
        WebSettings.logger.info(String.format("my.property by java: %s", JavaPropertyLoader.getProperty("my.property")));
    }
}
