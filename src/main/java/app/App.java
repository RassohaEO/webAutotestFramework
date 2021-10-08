package app;

import app.pages.*;

public class App {

    public LoginPage loginPage;
    public ITCourse itCourse;
    public FindTheJob findTheJob;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        itCourse = PageBuilder.buildITCourse();
        findTheJob = PageBuilder.buildFindTheJob();
    }
}
