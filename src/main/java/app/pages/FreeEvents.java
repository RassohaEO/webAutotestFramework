package app.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class FreeEvents extends BasePage{
    public SelenideElement signUpButton = $(By.className("btn_transparent_red"));
    public SelenideElement  easyUMOnline = $(By.className("amo-button--main-icon"));
    public SelenideElement  showMore = $(By.className("show_more_events btn_transparent_red"));
    public SelenideElement  razrabotkaSaita = $(By.className("develop-update__name"));
    public SelenideElement  bellButton = $(By.className("button-widget-open"));


    public FreeEvents(String pageUrl) {
        super(pageUrl);
    }
    @Step("кнопки: подробее,звонок за 27 сек,показать еще,меню чатов,разработка чатов")
    public void login(String email, String password) {

        signUpButton.click();
        easyUMOnline.click();
        showMore.click();
        razrabotkaSaita.click();
        bellButton.click();
    }

}
