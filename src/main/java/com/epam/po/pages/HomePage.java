package com.epam.po.pages;

import com.epam.entities.User;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.po.forms.LoginForm;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage {
    private LoginForm loginForm;

    @FindBy(css = ".profile-photo")
    private Button profilePhotoButton;

    public void login(User user) {
        profilePhotoButton.click();
        loginForm.login(user);
    }
}
