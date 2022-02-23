package task.navigation;

import task.exceptions.InvalidPasswordException;
import task.exceptions.InvalidUserNameException;

import java.util.Scanner;

public class LoginPage {

    Scanner scanner = new Scanner(System.in);

    private final String USER_NAME = "Oleksiy";
    private final String USER_PASSWORD = "123456";


    public void userNameValidation() {

        int failedAttemptsAmount = 0;
        boolean attemptsCheck = true;

        while (attemptsCheck) {
            try {
                System.out.println("Enter your name");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase(this.USER_NAME)) {
                    System.out.println("Enter your password");
                    break;
                } else {
                    throw new InvalidUserNameException();
                }

            } catch (InvalidUserNameException exception) {
                System.out.println("InvalidUserNameException: Invalid name");
                failedAttemptsAmount++;
            } finally {
                if (failedAttemptsAmount == 3) {
                    attemptsCheck = false;
                    System.out.println("No more attempts for name entering. Account blocked.");
                    System.exit(1);
                }
            }
        }
    }

    public void userPasswordValidation() {
        int failedAttemptsAmount = 0;
        boolean attemptsCheck = true;

        while (attemptsCheck) {
            try {
                String password = scanner.nextLine();
                if (password.equals(this.USER_PASSWORD) && password.length() == 6) {
                    System.out.println("You successfully signed in");
                    break;
                } else {
                    throw new InvalidPasswordException();
                }
            } catch (InvalidPasswordException exception) {
                System.out.println("InvalidPasswordException: Invalid password");
                failedAttemptsAmount++;
            } finally {
                if (failedAttemptsAmount == 3) {
                    attemptsCheck = false;
                    System.out.println("No more attempts for password entering. Account blocked.");
                    System.exit(1);
                }
            }
        }
    }
}


