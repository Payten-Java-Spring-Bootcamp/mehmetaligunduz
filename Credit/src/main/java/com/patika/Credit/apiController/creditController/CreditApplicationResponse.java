package com.patika.Credit.apiController.creditController;

import com.patika.Credit.common.enumeration.Status;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditApplicationResponse {
    private Status status;
    private double amountCredit;

    public static CreditApplicationResponse valueOf(Status status, double amountCredit){
        return CreditApplicationResponse.builder()
                .status(status)
                .amountCredit(amountCredit)
                .build();
    }
}
