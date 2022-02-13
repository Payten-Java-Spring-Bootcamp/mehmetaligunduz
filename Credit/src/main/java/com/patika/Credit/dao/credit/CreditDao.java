package com.patika.Credit.dao.credit;

import com.patika.Credit.common.enumeration.Status;

import java.util.Optional;

public interface CreditDao {
    Status getStatus(String id);
    double getAmountCredit(String id);
    Optional<Credit> getCredit(Long id);
    Long save(Credit credit);
    Credit getLastCreditByTRIdNumber(String id);

}
