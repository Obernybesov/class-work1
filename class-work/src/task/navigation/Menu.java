package task.navigation;

import task.menu_items.*;

import java.util.InputMismatchException;
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

    public void tasksList() {
        System.out.println("Tasks menu:");
        System.out.println("1. " + EVEN_NUMBER);
        System.out.println("2. " + ARMSTRONG);
        System.out.println("3. " + REVERSE);
        System.out.println("4. " + FIBONACCI);
        System.out.println("5. " + REPLACE);
    }

    public void selectMenuItem() {

            try {
                System.out.println("Select your task by number. Enter number from 1 to 5");
                int menuItem = scanner.nextInt();
                switch (menuItem) {
                    case 1:
                        System.out.println("\"" + EVEN_NUMBER + "\"" + " task selected");
                        evenNumber.getResult();
                        break;
                    case 2:
                        System.out.println("\"" + ARMSTRONG + "\"" + " task selected");
                        armstrong.armstrongCalculation();
                        break;
                    case 3:
                        System.out.println("\"" + REVERSE + "\"" + " task selected");
                        System.out.println("Reversed string: " + reverse.reverseString());
                        break;
                    case 4:
                        System.out.println("\"" + FIBONACCI + "\"" + " task selected");
                        fibonacci.fibonacciSequenceTwentyDigits();
                        break;
                    case 5:
                        System.out.println("\"" + REPLACE + "\"" + " task selected");
                        replace.stringWithReplacedChars();
                        break;
                    default:
                        System.out.println("There is no any task with such number. Try again.");
                        tasksList();
                        selectMenuItem();
                }
            } catch (InputMismatchException ime) {
                System.out.println("Error occurred");
                System.out.println("Seems you entered non integer value. Re-login to try again");
            }
    }

}
