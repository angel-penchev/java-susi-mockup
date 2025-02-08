package dev.penchev.automobile.services.users;

import dev.penchev.automobile.entities.iam.RegisteredUser;
import dev.penchev.automobile.entities.iam.User;

public interface UserService {
    User auth(String email, String password);

    void register(RegisteredUser user);
}
