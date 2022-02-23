package task.navigation;

import task.menu_items.*;

import java.util.Scanner;

public class Menu {


    private final String EVEN_NUMBER = "Even Number";
    private final String ARMSTRONG = "Armstrong";
    private final String REVERSE = "Reverse";
    private final String FIBONACCI = "Fibonacci";
    private final String REPLACE = "Replace";


    Scanner scanner = new Scanner(System.in);
    EvenNumber evenNumber = new EvenNumber();
    Armstrong armstrong = new Armstrong();
    Reverse reverse = new Reverse();
    Fibonacci fibonacci = new Fibonacci();
    Replace replace = new Replace();

    public void getMenu() {
        System.out.println("Tasks menu:");
        System.out.println("1. " + EVEN_NUMBER);
        System.out.println("2. " + ARMSTRONG);
        System.out.println("3. " + REVERSE);
        System.out.println("4. " + FIBONACCI);
        System.out.println("5. " + REPLACE);
    }

    public void selectMenuItem() {
        System.out.println("Select your task by number");
        int menuItem = scanner.nextInt();
        switch (menuItem) {
            case 1:
                System.out.println("\"" + EVEN_NUMBER + "\"" + " task selected");
                evenNumber.getResult();
                break;
            case 2:
                System.out.println("\"" + ARMSTRONG + "\"" + " task selected");
                armstrong.getResult();
                break;
            case 3:
                System.out.println("\"" + REVERSE + "\"" + " task selected");
                System.out.println("Reversed string: " + reverse.reverseString());
                break;
            case 4:
                System.out.println("\"" + FIBONACCI + "\"" + " task selected");
                fibonacci.getFibonacci();
                break;
            case 5:
                System.out.println("\"" + REPLACE + "\"" + " task selected");
                replace.getStringWithReplacedChars();
                break;
            default:
                System.out.println("There is no any task with such number");


        }
    }


}
