package task.menu_items;

import java.util.Scanner;

public class Reverse {

    /*3. Reverse (Напишите программу для переворачивания строки,
    изменив расположение символов в строке задом наперёд без использования встроенных в String функций.)*/

    Scanner scanner = new Scanner(System.in);

    public String reverseString() {
        String s = "Impossible to reverse such string. Re-login to try again";
        try {
            System.out.println("Enter string for reverse");
            String userString = scanner.nextLine();
            if (userString.equals("")) {
                throw new Exception("Entered string is empty");
            } else if (userString.length() == 1) {
                throw new Exception("Entered string is to small for reverse.");
            }
            else {
            char[] stringToCharArray = userString.toCharArray();
            String result = "";
            for (int i = stringToCharArray.length - 1; i >= 0; i--) {
                result += stringToCharArray[i];
            } return result; }
        } catch (Exception e) {

            e.printStackTrace();
        }
        return s;
    }
}
