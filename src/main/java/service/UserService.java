package service;

import server.database.entity.TUser;

public interface UserService {
    void save(TUser tUser);
    TUser findUserById(Integer id);
}
