package dev.penchev.automobile.services.users;

import dev.penchev.automobile.entities.iam.RegisteredUser;
import dev.penchev.automobile.entities.iam.User;
import dev.penchev.automobile.repositories.users.UserRepository;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User auth(String email, String password) {
        RegisteredUser user = userRepository.findByEmail(email).orElse(null);
        if (user == null || !user.validatePassword(password)) {
            return null;
        }

        return user;
    }

    @Override
    public void register(RegisteredUser user) {
        // TODO: add additional validations here
        userRepository.save((RegisteredUser) user);
    }
}
