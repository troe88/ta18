package com.epam.po;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.po.pages.ContactFormPage;
import com.epam.po.pages.HomePage;
import com.epam.po.pages.SimpleTablePage;

public class JdiSite extends WebSite {
    @JPage(url = "index.html")
    public static HomePage homePage;

    @JPage(url = "contacts.html")
    public static ContactFormPage contactFormPage;

    @JPage(url = "simple-table.html")
    public static SimpleTablePage simpleTablePage;
}
