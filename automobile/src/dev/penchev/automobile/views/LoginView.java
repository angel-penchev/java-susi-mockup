package dev.penchev.automobile.views;

import dev.penchev.automobile.entities.iam.User;
import dev.penchev.automobile.entities.iam.UserRole;

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
                User user = userService.auth(email, password);
                if (user == null) {
                    System.out.println("Invalid email or password.");
                    return;
                }

                if (user.getRole() == UserRole.GUEST) {
                    System.out.println("You are not logged in as a registered user.");
                    // GuestView.render(user);
                    return;
                }

                if (user.getRole() == UserRole.USER) {

                    System.out.println("Login successful!");
                    MainView.render(user);
                }

                return;
            }


            System.out.println("Try again? (y/n): ");
            String tryAgain = scanner.nextLine();
            if (!tryAgain.equalsIgnoreCase("y")) {
                return;
            }
        }
    }
}

