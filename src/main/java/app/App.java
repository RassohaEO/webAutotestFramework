package app;

import app.pages.*;

public class App {

    public LoginPage loginPage;
    public ITCourse itCourse;
    public FreeEvents freeEvents;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        itCourse = PageBuilder.buildITCourse();
        freeEvents = PageBuilder.buildFreeEvents();
    }
}
