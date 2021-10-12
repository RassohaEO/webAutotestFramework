package app;

import app.bookingPages.*;
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
        return new FindTheJob("/employment");
    }
    public static Contacts buildContacts() {return new Contacts("/contact");}
    public static MainPage buildMainPage() {return new MainPage("");}
    public static BookMainPage buildBookMainPage() {return new BookMainPage("");}

}
