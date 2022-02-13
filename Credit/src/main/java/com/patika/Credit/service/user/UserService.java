package com.patika.Credit.service.user;

import com.patika.Credit.dao.user.User;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class UserService {

    private String TRIdNumber;
    private String name;
    private String surname;
    private double salary;
    private String phone;

    User toUser() {
        return User.builder()
                .TRIdNumber(getTRIdNumber())
                .name(getName())
                .surname(getSurname())
                .salary(getSalary())
                .phone(getPhone())
                .build();
    }

    public static UserService valueOf(User user) {
        return UserService.builder()
                .TRIdNumber(user.getTRIdNumber())
                .name(user.getName())
                .surname(user.getSurname())
                .salary(user.getSalary())
                .phone(user.getPhone())
                .build();
    }
}

