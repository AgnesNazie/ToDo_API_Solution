package se.lexicon.todo_app.service;

import se.lexicon.todo_app.entity.User;

public interface UserService {
    User findByUsername(String username);
}
