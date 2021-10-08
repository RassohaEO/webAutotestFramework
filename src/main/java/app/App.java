package app;

import app.pages.*;

public class App {

    public LoginPage loginPage;
    public ITCourse itCourse;
    public Contacts contacts;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        itCourse = PageBuilder.buildITCourse();
        contacts = PageBuilder.buildContacts();
    }
}
