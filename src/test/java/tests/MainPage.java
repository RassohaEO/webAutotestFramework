package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class MainPage extends BaseTest{

    @Test
    public void application(){
        app.mainPage.open();
        app.mainPage.nameField.setValue("test");
        app.mainPage.nameField.shouldBe(Condition.exactText("test"));


    }
}
