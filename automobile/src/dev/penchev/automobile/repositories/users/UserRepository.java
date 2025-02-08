package dev.penchev.automobile.repositories.users;

import dev.penchev.automobile.entities.iam.RegisteredUser;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<RegisteredUser> findByEmail(String email);

    void save(RegisteredUser user);

    List<RegisteredUser> getAllUsers();
}
