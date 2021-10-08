package app;

import app.pages.*;

public class App {

    public LoginPage loginPage;
    public ITCourse itCourse;
    public FreeEvents freeEvents;
    public Contacts contacts;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        itCourse = PageBuilder.buildITCourse();
        freeEvents = PageBuilder.buildFreeEvents();
        contacts = PageBuilder.buildContacts();
    }
}
