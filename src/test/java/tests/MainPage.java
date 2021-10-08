package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class MainPage extends BaseTest{

    @Test
    public void application() {
        app.mainPage.open();
        app.mainPage.applicationButton.click();
        app.mainPage.modalWindow.shouldBe(Condition.visible);
        app.mainPage.nameField.setValue("test");
        app.mainPage.nameField.shouldHave(Condition.value("test"));
        app.mainPage.numberField.setValue("9036785634");
        app.mainPage.numberField.shouldHave(Condition.value("9036785634"));
        app.mainPage.emailField.setValue("test@mail.ru");
        app.mainPage.emailField.shouldHave(Condition.value("test@mail.ru"));
        app.mainPage.courseDropDown.click();
        app.mainPage.courseDropDownList.selectOptionContainingText("IT Продакт менеджер");
        app.mainPage.sendButton.click();
        app.mainPage.modalWindow.shouldNotBe(Condition.visible);
    }
}
