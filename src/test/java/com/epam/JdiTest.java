package com.epam;


import com.epam.entities.Feature;
import com.epam.entities.User;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.po.JdiSite;
import com.epam.utils.JavaPropertyLoader;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.enums.Pages.SERVICE;
import static com.epam.enums.Pages.SIMPLE_TABLE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class JdiTest extends BaseTest {

    @Test
    public void loginTest() {
        JdiSite.homePage.open();
        JdiSite.homePage.login(User.PETER);
//        JdiSite.homePage.headerMenu.select(SERVICE);
//        JdiSite.homePage.headerMenu.select(DATES);
        JdiSite.homePage.headerMenu.selects(SERVICE, SIMPLE_TABLE);

        List<Feature> features = JdiSite.simpleTablePage.jdiFeaturesTable.all();

        Feature expected = new Feature("Drivers1", "Selenium, Custom", "JavaScript, Appium, WinAPI, Sikuli");

        assertThat(features, hasItem(expected));


        WebSettings.logger.info(String.format("my.property by owner: %s", config.myProperty()));
        WebSettings.logger.info(String.format("my.property by java: %s", JavaPropertyLoader.getProperty("my.property")));
    }
}
