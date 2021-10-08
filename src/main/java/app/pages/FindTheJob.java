package app.pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class FindTheJob extends BasePage{

  //  public SelenideElement chatField = driver.findElement(By.xpath("//div[@class = 'amo-button-holder amo-horisontal']"));

    public SelenideElement chatButton = $(byXpath("//div[@class='amo-button-holder amo-horisontalt']"));

    public FindTheJob(String pageUrl) {
        super(pageUrl);


    }
}

