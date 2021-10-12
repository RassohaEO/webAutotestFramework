package app;

import app.bookingPages.*;
import app.pages.*;

public class App {

    public LoginPage loginPage;
    public ITCourse itCourse;
    public FindTheJob findTheJob;
    public FreeEvents freeEvents;
    public Contacts contacts;
    public MainPage mainPage;
    public BookMainPage bookMainPage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        itCourse = PageBuilder.buildITCourse();
        findTheJob = PageBuilder.buildFindTheJob();
        freeEvents = PageBuilder.buildFreeEvents();
        contacts = PageBuilder.buildContacts();
        mainPage = PageBuilder.buildMainPage();
        bookMainPage = PageBuilder.buildBookMainPage();
    }
}
