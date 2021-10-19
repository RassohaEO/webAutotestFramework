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
        app.contacts.telField.setValue("8999999999");
        app.contacts.emailField.setValue("test@mail.ru");
        app.contacts.dataField.setValue("2021.11.12");
        app.contacts.buttonDropDown.click();

    }
    @Test
    public void application(){
        app.contacts.open();
        app.contacts.nameFieldApplication.setValue("Test");
        app.contacts.telFieldApplication.setValue("89999999999");
        app.contacts.emailFieldApplication.setValue("test@mail.ru");
        app.contacts.textFieldApplication.setValue("test");
        app.contacts.buttonFieldApplication.click();


    }
    @Test
    public void chat(){
        app.contacts.open();
        app.contacts.buttonChat.click();
        //app.contacts.buttonChat2.shouldBe(Condition.visible);
        //app.contacts.buttonChat2.click();
        app.contacts.chatWindow.shouldBe(Condition.visible);
        app.contacts.textFieldChat.setValue("test");


    }
    @Test
    public void facebook(){
        app.contacts.open();
        app.contacts.buttonFb.click();
        app.contacts.emailFieldFb.click();
        app.contacts.emailFieldFb.setValue("43242@mail.ru");
        app.contacts.passwordEmailFieldFb.click();
        app.contacts.passwordEmailFieldFb.setValue("Lord3998232");
        app.contacts.buttonFbLogin.click();




    }



    @Test
    public void vk(){
        app.contacts.open();
        app.contacts.buttonVk.click();
        app.contacts.emailFieldVk.click();
        app.contacts.emailFieldVk.setValue("43242@mail.ru");
        app.contacts.passwordEmailFieldVk.click();
        app.contacts.passwordEmailFieldVk.setValue("Lord3998232");
        app.contacts.buttonVkLogin.click();




    }



    @Test
    public void instagram(){
        app.contacts.open();
        app.contacts.buttonInstagram.click();
        app.contacts.buttonLoginInstagram1.click();
        app.contacts.emailFieldInstagram.click();
        app.contacts.emailFieldInstagram.setValue("89036785634");
        app.contacts.passwordEmailFieldInstagram.click();
        app.contacts.passwordEmailFieldInstagram.setValue("8999999999");
        app.contacts.buttonInstagramLogin2.click();






    }


}
