package dev.penchev.automobile.entities.iam;

import dev.penchev.automobile.entities.Offer;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected String firstName;
    protected String lastName;
    protected UserRole role;

    protected List<Offer> bookmarkedOffers;

    public User(String firstName, String lastName, UserRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.bookmarkedOffers = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRole getRole() {
        return role;
    }

    public List<Offer> getBookmarkedOffers() {
        return bookmarkedOffers;
    }
}