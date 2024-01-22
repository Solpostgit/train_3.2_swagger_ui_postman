package pro.sky.train_3._swagger_ui_postman.service;

import org.springframework.stereotype.Service;
import pro.sky.train_3._swagger_ui_postman.model.User;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserService {
    private Map<Long, User> users = new HashMap<>();
    private Long generatedUserId = 1L;

    public User createUser(User user) {
        users.put(generatedUserId, user);
        generatedUserId++;
        return user;
    }

    public User getUserById(Long userId) {
        return users.get(userId);
    }

    public User updateUser(Long userId, User user) {
        users.put(generatedUserId, user);
        return user;
    }

    public User deleteUser(Long userId) {
        return users.remove(userId);
    }
}
