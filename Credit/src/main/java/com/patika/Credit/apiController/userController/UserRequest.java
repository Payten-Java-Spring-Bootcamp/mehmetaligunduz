package com.patika.Credit.apiController.userController;

import com.patika.Credit.service.user.UserService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class UserRequest {
    private String number;
    private String name;
    private String surname;
    private double salary;
    private String phone;

    public UserService toUser(){
        return UserService.builder()
                .TRIdNumber(getNumber())
                .name(getName())
                .surname(getSurname())
                .salary(getSalary())
                .phone(getPhone())
                .build();
    }
}
