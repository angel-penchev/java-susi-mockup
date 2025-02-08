package dev.penchev.automobile.repositories.users;

import dev.penchev.automobile.entities.iam.RegisteredUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private List<RegisteredUser> userList;

    public UserRepositoryImpl() {
        this.userList = new ArrayList<>();
    }

    @Override
    public Optional<RegisteredUser> findByEmail(String email) {
        return userList.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public void save(RegisteredUser user) {
        userList.add(user);
    }


    @Override
    public List<RegisteredUser> getAllUsers() {
        return new ArrayList<>(userList); // Return a copy to prevent external modification
    }


}
