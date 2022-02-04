package task.menu_items;

import java.util.Scanner;

public class Replace {

    /*      5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @.
            Буквы о на ноль. Выводит новую строку на экран.
            Добавить обработку длины строки, максимальная длина 30 символов.
            Строка может состоять из нескольких слов и любых символов)*/

    Scanner scanner = new Scanner(System.in);

    public void getStringWithReplacedChars() {
        System.out.println("Enter string for chars replacing");
        String userInput = scanner.nextLine();
        if (userInput.length() > 30) {
            System.out.println("Entered string is to long");
        } else {
            String stringReplace = userInput.replace('a', '@').replace('o', '0');
            System.out.println("String with replaced chars: " + stringReplace);
        }
    }


}
