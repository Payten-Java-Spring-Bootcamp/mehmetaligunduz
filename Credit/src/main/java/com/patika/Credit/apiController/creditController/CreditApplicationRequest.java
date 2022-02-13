package com.patika.Credit.apiController.creditController;

import com.patika.Credit.service.user.UserService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class CreditApplicationRequest {
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
