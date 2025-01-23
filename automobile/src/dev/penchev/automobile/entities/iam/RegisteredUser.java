package dev.penchev.automobile.entities.iam;

import dev.penchev.automobile.entities.Offer;

import java.time.LocalDateTime;
import java.util.List;

public class RegisteredUser extends User {
    protected String email;
    protected String passwordHash;

    protected List<Offer> listedOffers;

    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;

    public RegisteredUser(String email, String password, String firstName, String lastName) {
        super(firstName, lastName, UserRole.USER);

        this.email = email;
        this.passwordHash = password;  // TODO: make passwords actual hashes
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
