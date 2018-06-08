package com.epam.po.pages;

import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage extends WebPage {

    @JDropdown(
            root = @FindBy(css = "#gender"),
            list = @FindBy(css = "option")
    )
    public Dropdown gender = new Dropdown() {
        @Override
        protected void selectAction(String name) {
            super.selectAction(name);
        }
    };
}
