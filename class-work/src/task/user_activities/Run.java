package task.user_activities;

import task.navigation.LoginPage;
import task.navigation.Menu;

public class Run {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        Menu menu = new Menu();

        loginPage.userNameValidation();
        loginPage.userPasswordValidation();
        menu.tasksList();
        menu.selectMenuItem();
    }
}
