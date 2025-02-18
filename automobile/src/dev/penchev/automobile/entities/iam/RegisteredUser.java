package dev.penchev.automobile.entities.iam;

import dev.penchev.automobile.entities.Offer;

import java.time.LocalDateTime;
import java.util.List;

public class RegisteredUser extends User {
    protected String email;
    protected String passwordHash;

    protected String phoneNumber;

    protected List<Offer> listedOffers;

    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;

    public RegisteredUser(String email, String phoneNumber, String password, String firstName, String lastName) {
        super(firstName, lastName, UserRole.USER);

        this.email = email;
        this.passwordHash = password;  // TODO: make passwords actual hashes
        this.phoneNumber = phoneNumber;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Offer> getListedOffers() {
        return listedOffers;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public boolean validatePassword(String providedPassword) {
        return providedPassword.equals(this.passwordHash);
    }
}
