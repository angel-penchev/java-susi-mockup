package dev.penchev.automobile.views;

import dev.penchev.automobile.entities.iam.RegisteredUser;

import java.util.Scanner;

public class RegistrationView extends View {
    public static void render() {
        clearConsole();
        System.out.println("--- Registration ---");

        String email = getValidatedInput("Email:", "Please enter a valid email address."); // Add validation later
        String phoneNumber = getValidatedInput("Phone Number:", "Please enter a valid phone number."); // Add validation later
        String password = getValidatedInput("Password:", "Password must be at least 8 characters."); // Add validation later
        String firstName = getValidatedInput("First Name:", "First name cannot be empty.");
        String lastName = getValidatedInput("Last Name:", "Last name cannot be empty.");

        RegisteredUser newUser = new RegisteredUser(email, phoneNumber, password, firstName, lastName);
        System.out.println("User registered successfully!");
        // TODO
    }


    private static String getValidatedInput(String prompt, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (isValid(input, prompt)) {
                return input;
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    private static boolean isValid(String input, String prompt) {
        // Example checks (expand as needed):
        if (prompt.equals("Password")) {
            return input.length() >= 8 && input.contains("[A-Z]") && input.contains("[a-z]") && input.contains("[0-9]");
        }

        if (prompt.equals("First Name") || prompt.equals("Last Name")) {
            return !input.isEmpty() && input.length() <= 20;
        }

        // Basic "not empty" check for other fields
        return !input.isEmpty();
    }
}
