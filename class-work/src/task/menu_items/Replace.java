package task.menu_items;

import java.io.IOException;
import java.util.Scanner;

public class Replace {

    /*      5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @.
            Буквы о на ноль. Выводит новую строку на экран.
            Добавить обработку длины строки, максимальная длина 30 символов.
            Строка может состоять из нескольких слов и любых символов)*/

    Scanner scanner = new Scanner(System.in);

    public void stringWithReplacedChars() {

        try {

            System.out.println("Enter string for chars replacing");
            String userInput = scanner.nextLine();
            if (userInput.length() > 30) {
                throw new Exception("Entered string is too long");
            } else if (userInput.equals("")) {
                throw new Exception("Entered string is empty");
            }
            else {
                String stringReplace = userInput.replace('a', '@').replace('o', '0');
                System.out.println("String with replaced chars: " + stringReplace);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Impossible to use replacing in such string. Re-login to try again");
        }
    }
}
