package task.navigation;

import java.util.Scanner;

public class LoginPage {

    Scanner scanner = new Scanner(System.in);

    private final String USER_NAME = "Oleksiy";
    private final String USER_PASSWORD = "123456";


    public void setName() {
        System.out.println("Enter yor name");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase(this.USER_NAME)) {
            System.out.println("Enter your password");
        } else {
            System.out.println("Incorrect name");
            System.exit(1);
        }
    }

    public void setPassword() {
        String password = scanner.nextLine();
        if (password.equals(this.USER_PASSWORD) && password.length() == 6) {
            System.out.println("You successfully signed in");
        } else {
            System.out.println("Invalid password");
            System.exit(1);
        }
    }
}
