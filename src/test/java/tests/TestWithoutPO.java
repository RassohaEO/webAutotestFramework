package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import org.testng.annotations.*;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestWithoutPO {

    @BeforeClass
    public static void setup() {
        Configuration.browser = "chrome";
       // WebDriverManager.chromedriver().browserVersion("94.0.4147.30").setup();
        // Configuration.baseUrl = "https://www.open.ru/";
        Configuration.baseUrl = "https://internetbankmb.open.ru/login";
        //Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @AfterClass
    public static void close() {
        closeWebDriver();
    }


    @Test
    public void menuLocator() {
        open(Configuration.baseUrl);
        SelenideElement menu = $(By.xpath("//div[@class='ant-col main-page-header__sub-nav-wrap ant-col-xs-0 ant-col-lg-14 ant-col-xl-15']"));
        menu.findElement(By.partialLinkText("Платежи и переводы")).click();
    }


    @Test
    public void login() {
        open("https://internetbankmb.open.ru/login");

        SelenideElement login =$(By.name("username"));
        login.setValue("3758289@mail.ru");

        SelenideElement password = $(By.name("password"));
        password.setValue("test123");


//*[@type='submit']
        //*[@class='sc-dFRpbK sc-gIvpjk rDtbU gSfnGQ']



    }

}
