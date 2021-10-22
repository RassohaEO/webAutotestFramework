package app.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Contacts extends BasePage {
    public Contacts(String pageUrl) {
        super(pageUrl);
    }
    public SelenideElement userName = $(byName("uname"));
    public SelenideElement userPhone = $(byName("utel"));
    public SelenideElement userEmail = $(byName("uemail"));
    public SelenideElement userMessage = $(byName("umessage"));
    public SelenideElement submitButton = $(byXpath("//button[@type='submit']"));
    //rent
    public SelenideElement menuRed = $(byXpath("//button[@id='menu_btn']"));
    public SelenideElement additionalMenu = $(byXpath("//div[@id='additional_menu']"));
    public SelenideElement buttonArenda = $(byXpath("//a[@title='Аренда']"));
    public SelenideElement buttonOrderRent = $(byXpath("//a[@class='btn_transparent_red rent_classroom']"));
    public SelenideElement rentWindow = $(byXpath("//div[@id='rent_classroom_modal']"));
    public SelenideElement nameField = $(byXpath("(//input[@name='uname'])[1]"));
    public SelenideElement telField = $(byXpath("(//input[@name='utel'])[1]"));
    public SelenideElement emailField = $(byXpath("(//input[@name='uemail'])[1]"));
    public SelenideElement dataField = $(byXpath("//input[@name='uday']"));
    public SelenideElement buttonDropDown = $(byXpath("(//input[@type='submit'])[1]"));
    //application
    public SelenideElement nameFieldApplication = $(byXpath("(//input[@name='uname'])[1]"));
    public SelenideElement telFieldApplication = $(byXpath("(//input[@name='utel'])[1]"));
    public SelenideElement emailFieldApplication = $(byXpath("(//input[@name='uemail'])[1]"));
    public SelenideElement textFieldApplication = $(byXpath("//textarea[@name='umessage']"));
    public SelenideElement buttonFieldApplication = $(byXpath("(//input[@type='submit'])[1]"));
    //chat
    public SelenideElement buttonChat = $(byXpath("//div[@class='amo-button--main-icon']"));
    public SelenideElement buttonChat2 = $(byXpath(" (//a[@class='amo-button__link'])[3]"));
    public SelenideElement chatWindow = $(byXpath("//textarea[@placeholder='Написать сообщение...']"));
    public SelenideElement textFieldChat = $(byXpath("//textarea[@placeholder='Написать сообщение...']"));
    //fb
    public SelenideElement buttonFb = $(byXpath("//a[@class='soc_item fb']"));
    public SelenideElement emailFieldFb= $(byXpath("//input[@data-testid='royal_email']"));
    public SelenideElement passwordEmailFieldFb= $(byXpath("//input[@data-testid='royal_pass']"));
    public SelenideElement buttonFbLogin= $(byXpath("//input[@data-testid='royal_login_button']"));
    //vk
    public SelenideElement buttonVk = $(byXpath("//a[@class='soc_item vk']"));
    public SelenideElement emailFieldVk= $(byXpath("//input[@id='quick_email']"));
    public SelenideElement passwordEmailFieldVk= $(byXpath("//input[@id='quick_pass']"));
    public SelenideElement buttonVkLogin= $(byXpath("//button[@id='quick_login_button']"));
    //Instagram
    public SelenideElement buttonInstagram = $(byXpath("//a[@class='soc_item insta']"));
    public SelenideElement buttonLoginInstagram1 = $(byXpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
    public SelenideElement emailFieldInstagram= $(byXpath("//input[@name='username']"));
    public SelenideElement passwordEmailFieldInstagram= $(byXpath("//input[@name='password']"));
    public SelenideElement buttonInstagramLogin2= $(byXpath("//button[@type='submit']"));
}
