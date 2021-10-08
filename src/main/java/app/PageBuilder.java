package app;

import app.pages.*;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/login");
    }
    public static ITCourse buildITCourse() {
        return new ITCourse("/it-courses");
    }
    public static FindTheJob buildFindTheJob() {
        return new ITCourse("/employment");
    }

//    https://it.easyum.ru/it-courses/
//    https://it.easyum.ru
    // https://it.easyum.ru/employment/

}
