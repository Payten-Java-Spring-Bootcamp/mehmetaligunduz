package com.patika.Credit.service.credit;

import com.patika.Credit.common.enumeration.Status;
import com.patika.Credit.dao.credit.Credit;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class CreditService {
    private Status status;
    private double amountCredit;

    Credit toCredit(){
        return Credit.builder()
                .status(getStatus())
                .amountCredit(getAmountCredit())
                .build();
    }

    public static CreditService valueOf(Credit credit){
        return CreditService.builder()
                .status(credit.getStatus())
                .amountCredit(credit.getAmountCredit())
                .build();
    }
}
