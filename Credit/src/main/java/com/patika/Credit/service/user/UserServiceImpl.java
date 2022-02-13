package com.patika.Credit.service.user;


import com.patika.Credit.dao.user.User;
import com.patika.Credit.dao.user.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final UserDao userDao;

    @Override
    public Long create(UserService userService) {
        User user = userService.toUser();
        return userDao.create(user);
    }

    @Override
    public Long update(Long id, UserService userService) {
        User user = userService.toUser();
        return userDao.update(id, user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public User getUser(Long id) {
       return userDao.getUser(id);
    }

    @Override
    public User getUserByTRIdNumber(String id) {
        return userDao.getUserByTRIdNumber(id);
    }
}
