package com.patika.Credit.apiController.userController;

import com.patika.Credit.service.credit.CreditService;
import com.patika.Credit.service.credit.ICreditService;
import com.patika.Credit.service.user.IUserService;
import com.patika.Credit.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final ICreditService iCreditService;
    private final IUserService iUserService;
    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest){
        UserService userService = userRequest.toUser();
        Long id = iUserService.create(userService);
        UserResponse userResponse = UserResponse.valueOf(id);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userResponse);
    }
}
