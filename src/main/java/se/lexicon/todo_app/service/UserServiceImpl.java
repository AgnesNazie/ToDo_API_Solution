package se.lexicon.todo_app.service;

import org.springframework.stereotype.Service;
import se.lexicon.todo_app.entity.User;
import se.lexicon.todo_app.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found: " + username));
    }
}
