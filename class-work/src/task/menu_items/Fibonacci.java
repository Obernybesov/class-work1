package task.menu_items;

public class Fibonacci {

    /*4. Fibonacci. Рассчитать первых 20 (в изначальном задании 50, но вроде на занятии сошлись на 20ти)
    чисел Фиббоначии вывести их на экран*/



    public void getFibonacci() {
       int fibonacci[] = new int[20];
        System.out.println("First 20 digits of Fibonacci sequence:");
        fibonacci[0] = 1;
        System.out.print(fibonacci[0] + " ");
        fibonacci[1] = 1;
        System.out.print(fibonacci[1] + " ");
        for (int i = 2; i < fibonacci.length; i++) {
             fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }

    }

}
