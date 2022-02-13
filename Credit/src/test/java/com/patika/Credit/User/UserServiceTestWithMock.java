package com.patika.Credit.User;

import com.patika.Credit.dao.user.User;
import com.patika.Credit.dao.user.UserDao;
import com.patika.Credit.dao.user.UserDaoImpl;
import com.patika.Credit.service.user.IUserService;
import com.patika.Credit.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.Mockito.*;

@RequiredArgsConstructor
@ExtendWith(MockitoExtension.class)
class UserServiceTestWithMock {
    @Mock
    UserDao userDao;

    @Test
    void should_create_user(){
        //mock
        User mockUser = User.builder()
                .TRIdNumber("11111111")
                .name("Mehmet")
                .surname("Gunduz")
                .phone("05554443322")
                .build();

    }
}
