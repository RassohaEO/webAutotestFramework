package app;

import app.pages.*;

public class App {

    public LoginPage loginPage;
    public ITCourse itCourse;
    public FindTheJob findTheJob;
    public FreeEvents freeEvents;
    public Contacts contacts;
    public MainPage mainPage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        itCourse = PageBuilder.buildITCourse();
        findTheJob = PageBuilder.buildFindTheJob();
        freeEvents = PageBuilder.buildFreeEvents();
        contacts = PageBuilder.buildContacts();
        mainPage = PageBuilder.buildMainPage();
    }
}
