package task.navigation;

import task.menu_items.*;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    private int menuItem;
    private final String ARMSTRONG = "Armstrong";
    private final String EVEN_NUMBER = "Even Number";
    private final String FIBONACCI = "Fibonacci";
    private final String REPLACE = "Replace";
    private final String REVERSE = "Reverse";

    public void getMenu() {
        System.out.println("1. " + EVEN_NUMBER);
        System.out.println("2. " + ARMSTRONG);
        System.out.println("3. " + REVERSE);
        System.out.println("4. " + FIBONACCI);
        System.out.println("5. " + REPLACE);
    }

    public void selectMenuItem() {
        System.out.println("Select your task by number");
        menuItem = scanner.nextInt();
        switch (menuItem) {
            case 1:
                EvenNumber evenNumber = new EvenNumber();
                evenNumber.getResult();
                break;
            case 2:
                Armstrong armstrong = new Armstrong();
                armstrong.getResult();
                break;
            case 3:
                Reverse reverse = new Reverse();
                break;
            case 4:
                Fibonacci fibonacci = new Fibonacci();
                break;
            case 5:
                Replace replace = new Replace();
                break;
            default:
                System.out.println("There is no any task with such number");


        }
    }


}
