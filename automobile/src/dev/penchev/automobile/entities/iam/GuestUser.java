package dev.penchev.automobile.entities.iam;

public class GuestUser extends User {
    public GuestUser() {
        super( "Guest", "User", UserRole.GUEST);
    }
}
