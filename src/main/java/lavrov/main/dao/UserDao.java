package lavrov.main.dao;

import lavrov.main.model.User;


import java.util.List;

public interface UserDao {
    List<User> getUserList();

    User getUserById(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

}
