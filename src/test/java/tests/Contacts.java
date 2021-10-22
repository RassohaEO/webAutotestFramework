package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class Contacts extends BaseTest{
    @Test
    public void rent(){
        app.contacts.open();
        app.contacts.menuRed.click();
        app.contacts.additionalMenu.shouldBe(Condition.visible);
        app.contacts.buttonArenda.click();
        app.contacts.buttonOrderRent.click();
        app.contacts.rentWindow.shouldBe(Condition.visible);
        app.contacts.nameField.setValue("Test");
        app.contacts.nameField.shouldHave(Condition.exactValue("Test"));
        app.contacts.telField.setValue("8999999999");
        app.contacts.telField.shouldHave(Condition.exactValue("8999999999"));
        app.contacts.emailField.setValue("test@mail.ru");
        app.contacts.emailField.shouldHave(Condition.exactValue("test@mail.ru"));
        app.contacts.dataField.setValue("2021.11.12");
        app.contacts.dataField.shouldHave(Condition.exactValue("2021.11.12"));
        app.contacts.buttonDropDown.click();
    }
    @Test
    public void application(){
        app.contacts.open();
        app.contacts.nameFieldApplication.setValue("Test");
        app.contacts.nameFieldApplication.shouldHave(Condition.exactValue("Test"));
        app.contacts.telFieldApplication.setValue("89999999999");
        app.contacts.telFieldApplication.shouldHave(Condition.exactValue("89999999999"));
        app.contacts.emailFieldApplication.setValue("test@mail.ru");
        app.contacts.emailFieldApplication.shouldHave(Condition.exactValue("test@mail.ru"));
        app.contacts.textFieldApplication.setValue("test");
        app.contacts.textFieldApplication.shouldHave(Condition.exactValue("test"));
        app.contacts.buttonFieldApplication.click();
    }
    @Test
    public void chat(){
        app.contacts.open();
        app.contacts.buttonChat.click();
        app.contacts.chatWindow.shouldBe(Condition.visible);
        app.contacts.textFieldChat.setValue("test");
        app.contacts.textFieldChat.shouldHave(Condition.exactValue("test"));
    }
    @Test
    public void facebook(){
        app.contacts.open();
        app.contacts.buttonFb.click();
        app.contacts.emailFieldFb.click();
        app.contacts.emailFieldFb.setValue("43242@mail.ru");
        app.contacts.emailFieldFb.shouldHave(Condition.exactValue("43242@mail.ru"));
        app.contacts.passwordEmailFieldFb.click();
        app.contacts.passwordEmailFieldFb.setValue("Lord3998232");
        app.contacts.passwordEmailFieldFb.shouldHave(Condition.exactValue("Lord3998232"));
        app.contacts.buttonFbLogin.click();
    }
    @Test
    public void vk(){
        app.contacts.open();
        app.contacts.buttonVk.click();
        app.contacts.emailFieldVk.click();
        app.contacts.emailFieldVk.setValue("43242@mail.ru");
        app.contacts.emailFieldVk.shouldHave(Condition.exactValue("43242@mail.ru"));
        app.contacts.passwordEmailFieldVk.click();
        app.contacts.passwordEmailFieldVk.setValue("Lord3998232");
        app.contacts.passwordEmailFieldVk.shouldHave(Condition.exactValue("Lord3998232"));
        app.contacts.buttonVkLogin.click();
    }
    @Test
    public void instagram(){
        app.contacts.open();
        app.contacts.buttonInstagram.click();
        app.contacts.buttonLoginInstagram1.click();
        app.contacts.emailFieldInstagram.click();
        app.contacts.emailFieldInstagram.setValue("89036785634");
        app.contacts.emailFieldInstagram.shouldHave(Condition.exactValue("89036785634"));
        app.contacts.passwordEmailFieldInstagram.click();
        app.contacts.passwordEmailFieldInstagram.setValue("8999999999");
        app.contacts.passwordEmailFieldInstagram.shouldHave(Condition.exactValue("8999999999"));
        app.contacts.buttonInstagramLogin2.click();
    }
}
