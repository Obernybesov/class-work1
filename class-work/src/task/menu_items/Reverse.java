package task.menu_items;

import java.util.Scanner;

public class Reverse {

    /*3. Reverse (Напишите программу для переворачивания строки,
    изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)*/

    Scanner scanner = new Scanner(System.in);

    public String reverseString() {
        System.out.println("Enter string for reverse");
        String userString = scanner.nextLine();
        char[] stringToCharArray = userString.toCharArray();
        String result = "";
        for (int i = stringToCharArray.length - 1; i >= 0; i--) {
            result += stringToCharArray[i];
        } return result;


    }

}
