package app;

import app.pages.*;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/login");
    }
    public static ITCourse buildITCourse() {
        return new ITCourse("/events");
    }public static FreeEvents buildFreeEvents() {
        return new FreeEvents("/events");
    }
    public static FindTheJob buildFindTheJob() {
        return new ITCourse("/employment");
    }
    public static Contacts buildContacts() {return new Contacts("/contact");}


//    https://it.easyum.ru/it-courses/
//    https://it.easyum.ru
    // https://it.easyum.ru/employment/
// https://it.easyum.ru/events/
//    https://it.easyum.ru//
//    https://it.easyum.ru/contact/

}
