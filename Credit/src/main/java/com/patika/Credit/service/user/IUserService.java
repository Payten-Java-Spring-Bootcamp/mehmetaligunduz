package com.patika.Credit.service.user;

import com.patika.Credit.dao.user.User;

public interface IUserService {
    Long create(UserService userService);
    Long update(Long id, UserService userService);
    void delete(Long id);
    User getUser(Long id);
    User getUserByTRIdNumber(String id);
}
