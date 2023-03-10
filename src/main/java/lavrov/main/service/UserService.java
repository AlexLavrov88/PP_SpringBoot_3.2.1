package lavrov.main.service;

import lavrov.main.model.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    User getUserById(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
