package task.menu_items;

import java.util.Scanner;

public class Armstrong {

        /*2. Armstrong (Напишите программу для проверки является ли введенное число - числом Армстронга.
            Число Армстронга это число, значение которого равно сумме цифр, из
            которых оно состоит, возведенных в степень, равную количеству цифр в этом числе. Как пример - число 371:
            371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
            Если у вас число четырехзначное:
            8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208)*/

        Scanner scanner = new Scanner(System.in);

        int reminder;
        int result;

        //It's incorrect decision. Just 1st attempt

        public void getResult() {

            System.out.println("Enter your number");
            int userNumber = scanner.nextInt();
            String uNumberToString = Integer.toString(userNumber);

            while (userNumber != 0) {
                reminder = userNumber % 10;
                result += Math.pow(reminder, uNumberToString.length());
                userNumber /= 10;
            }
            if(result == userNumber) {
                System.out.println(userNumber + " Armstrong");
            } else {
                System.out.println(userNumber + "not Armstrong");
            }

        }


}
