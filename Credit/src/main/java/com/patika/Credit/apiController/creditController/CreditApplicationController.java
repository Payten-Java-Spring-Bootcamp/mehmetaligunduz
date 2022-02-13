package com.patika.Credit.apiController.creditController;

import com.patika.Credit.service.credit.CreditService;
import com.patika.Credit.service.credit.ICreditService;
import com.patika.Credit.service.user.IUserService;
import com.patika.Credit.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/creditApplication")
@RequiredArgsConstructor
public class CreditApplicationController {
    private final ICreditService iCreditService;
    private final IUserService iUserService;
    @PostMapping
    public ResponseEntity<CreditApplicationResponse> apply(@RequestBody CreditApplicationRequest creditApplicationRequest){
        UserService userService = creditApplicationRequest.toUser();
        CreditService result = iCreditService.getStatusAndLimit(userService.getTRIdNumber(), userService.getSalary());
        CreditApplicationResponse creditApplicationResponse = CreditApplicationResponse.valueOf(result.getStatus(), result.getAmountCredit());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(creditApplicationResponse);
    }
}
