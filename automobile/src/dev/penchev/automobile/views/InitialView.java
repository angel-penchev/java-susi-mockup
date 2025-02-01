package dev.penchev.automobile.views;

import java.util.Scanner;

public class InitialView implements View {
    public static void render() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Automobile Platform!");
            System.out.println("Please choose an option:");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Continue as Guest");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.println("You chose to Sign Up.");
                        // Implement sign-up logic
                        break;
                    case 2:
                        System.out.println("You chose to Sign In.");
                        // Implement sign-in logic
                        break;
                    case 3:
                        System.out.println("You chose to Continue as Guest.");
                        // Implement guest logic
                        break;
                    case 4:
                        System.out.println("Exiting. Cya! \uD83C\uDF0A");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
            System.out.println();
        }
    }
}
