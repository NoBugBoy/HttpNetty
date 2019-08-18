package service;

import database.entity.TUser;

public interface UserService {
    void save(TUser tUser);
    TUser findUserById(Integer id);
}
