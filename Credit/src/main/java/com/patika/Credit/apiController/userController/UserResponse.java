package com.patika.Credit.apiController.userController;

import com.patika.Credit.common.enumeration.Status;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;

    public static UserResponse valueOf(Long id){
        return UserResponse.builder()
                .id(id)
                .build();
    }
}
