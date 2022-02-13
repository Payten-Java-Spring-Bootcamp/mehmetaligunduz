package com.patika.Credit.dao.user;

public interface UserDao {
    Long create(User user);
    Long update(Long id, User user);
    void delete(Long id);
    User getUser(Long id);
    User getUserByTRIdNumber(String id);
}
