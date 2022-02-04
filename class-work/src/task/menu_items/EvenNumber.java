package task.menu_items;

import java.util.Scanner;

public class EvenNumber {

    /*1. Even Number (Напишите программу которая определяет, является ли число четным или нет.
            Проверять только целые числа.
            Добавить обработку ошибок с описанием.)*/

    Scanner scanner = new Scanner(System.in);


    public void getResult() {

        System.out.println("Enter your number");
        int userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("You entered the even number");
        } else{
            System.out.println("You entered the odd number");
        }
    }

}
