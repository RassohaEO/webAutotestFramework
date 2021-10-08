package app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage{
    public MainPage(String pageUrl) {
        super(pageUrl);
    }

    //applicationForm
    public SelenideElement applicationButton = $(byXpath("//button[@class='red_btn top_order open_order_modal']"));
    public SelenideElement modalWindow = $(byId("order_modal"));
    public SelenideElement numberField = $(byXpath("(//input[@type='tel'])[2]"));
    public SelenideElement nameField = $(byXpath("(//input[@name='uname'])[2]"));

    public SelenideElement courseDropDown = $(By.xpath("(//span[@class='wpcf7-form-control-wrap ucourse'])[2]"));
    public SelenideElement courseDropDownList = $(By.xpath("//select[@name='ucourse']"));

    public SelenideElement sendButton = $(byXpath("(//input[@type='submit'])[2]"));
    public SelenideElement emailField = $(byXpath("(//input[@type='email'])[2]"));

}
