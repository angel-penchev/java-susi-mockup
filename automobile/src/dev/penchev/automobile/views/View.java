package dev.penchev.automobile.views;

import dev.penchev.automobile.repositories.users.UserRepository;
import dev.penchev.automobile.repositories.users.UserRepositoryImpl;
import dev.penchev.automobile.services.users.UserService;
import dev.penchev.automobile.services.users.UserServiceImpl;

import java.io.IOException;

public abstract class View {
    protected static final UserRepository userRepository = new UserRepositoryImpl();
    protected static final UserService userService = new UserServiceImpl(userRepository);

    static void render() {
    }

    static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.err.println("Error clearing console: " + ex.getMessage());
        }
    }
}
