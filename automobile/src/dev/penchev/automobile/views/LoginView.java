package dev.penchev.automobile.views;

import java.util.Scanner;

public class LoginView extends View {
    public static void render() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Login");
            System.out.println("-----");

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (email.isEmpty() || password.isEmpty()) {
                System.out.println("Email and password cannot be empty.");
            } else {
                // if (isValidLogin(email, password)) {
                if (true) { // TODO
                    System.out.println("Login successful!");
                    return;
                } else {
                    System.out.println("Invalid email or password.");
                }
            }


            System.out.println("Try again? (y/n): ");
            String tryAgain = scanner.nextLine();
            if (!tryAgain.equalsIgnoreCase("y")) {
                return;
            }
        }
    }
}

