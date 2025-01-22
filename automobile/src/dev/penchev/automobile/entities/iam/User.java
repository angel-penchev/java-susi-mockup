package dev.penchev.automobile.entities.iam;

import java.time.LocalDateTime;

public class User {
    protected String email;
    protected String passwordHash; // TODO: make passwords actual hashes

    protected String firstName;
    protected String lastName;

    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;

    public User(String email, String passwordHash, String firstName, String lastName) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;

        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}