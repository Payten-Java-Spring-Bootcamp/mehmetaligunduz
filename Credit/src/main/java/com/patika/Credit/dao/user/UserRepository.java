package com.patika.Credit.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from user u where u.TRIdNumber = ?1")
    User findUserByTRIdNumber(String id);
}
