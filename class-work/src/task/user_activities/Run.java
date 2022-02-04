package task.user_activities;

import task.navigation.LoginPage;
import task.navigation.Menu;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        Menu menu = new Menu();

        loginPage.setName();
        loginPage.setPassword();
        menu.getMenu();
        menu.selectMenuItem();



    }
}
