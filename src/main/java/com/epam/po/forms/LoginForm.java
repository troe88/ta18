package com.epam.po.forms;

import com.epam.entities.User;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends Form<User> {
    @FindBy(css = "#Name")
    public TextField login;

    @FindBy(css = "#Password")
    public TextField password;

    @FindBy(css = "form [type='submit']")
    public Button submit;
}
