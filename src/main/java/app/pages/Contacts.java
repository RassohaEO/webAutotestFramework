package app.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Contacts extends BasePage{
    public Contacts(String pageUrl) {
        super(pageUrl);
    }

    public SelenideElement userName = $(byName("uname"));
    public SelenideElement userPhone = $(byName("utel"));
    public SelenideElement userEmail = $(byName("uemail"));
    public SelenideElement userMessage = $(byName("umessage"));
    public SelenideElement submitButton = $(byXpath("//button[@type='submit']"));




}
