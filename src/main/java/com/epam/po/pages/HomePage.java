package com.epam.po.pages;

import com.epam.entities.User;
import com.epam.enums.Pages;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.po.elements.MyMenu;
import com.epam.po.forms.LoginForm;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage {
    public LoginForm loginForm;

    @FindBy(css = ".nav")
    public MyMenu<Pages> headerMenu;

    @FindBy(css = ".profile-photo")
    public Button profilePhotoButton;

    public void login(User user) {
        profilePhotoButton.click();
        loginForm.login(user);
    }
}
