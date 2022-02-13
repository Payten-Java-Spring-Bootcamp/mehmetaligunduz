package com.patika.Credit.dao.user;

import com.patika.Credit.common.exception.NoContentException;
import com.patika.Credit.common.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

    @Override
    public Long create(User user) {
        return userRepository.save(user).getId();
    }

    @Override
    public Long update(Long id, User userParam) {
        User user = userRepository.findById(id).orElseThrow(NotFoundException.withSupplier());
        user.setTRIdNumber(userParam.getTRIdNumber());
        user.setName(userParam.getName());
        user.setSurname(userParam.getSurname());
        user.setPhone(userParam.getPhone());
        user.setUpdatedDate(Instant.now());
        return userRepository.save(user).getId();
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.findById(id).orElseThrow(NoContentException.withSupplier());
        userRepository.deleteById(user.getId());
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User getUserByTRIdNumber(String id) {
        return userRepository.findUserByTRIdNumber(id);
    }
}
