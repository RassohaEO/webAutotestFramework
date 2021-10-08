package app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage{
    public MainPage(String pageUrl) {
        super(pageUrl);
    }

    //applicationForm
    public SelenideElement applicationButton = $(byXpath("//button[@class='red_btn top_order open_order_modal']"));
    public SelenideElement numberField = $(byName("utel"));
    public SelenideElement nameField = $(byName("uname"));
    public SelenideElement dropDown = $(byName("ucourse"));
    public SelenideElement sendButton = $(By.className("wpcf7-form-control wpcf7-submit"));
    public SelenideElement emailField = $(byName("uemail"));

}
