package com.patika.Credit.service.credit;

import com.patika.Credit.common.enumeration.Status;
import com.patika.Credit.dao.credit.Credit;
import com.patika.Credit.dao.credit.CreditDao;
import com.patika.Credit.dao.user.UserDao;
import com.patika.Credit.service.mock.IMockCreditScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CreditServiceImpl implements ICreditService{

    private final int CREDIT_LIMIT_MULTIPLIER = 4;
    private final CreditDao creditDao;
    private final UserDao userDao;
    private final IMockCreditScoreService iMockCreditScoreService;

    @Override
    public CreditService getStatusAndLimit(String id) {
        Credit credit = creditDao.getLastCreditByTRIdNumber(id);
        return CreditService.valueOf(credit);
    }

    @Override
    public CreditService getStatusAndLimit(String id, double salary) {
        return helperCreditCalculation(id, salary);
    }

    private CreditService helperCreditCalculation(String id, double salary){
        int creditScore = iMockCreditScoreService.getScore(id);
        double creditLimit = 0;
        Status status = Status.APPROVED;

        if (creditScore >= 1000){
            creditLimit = salary * CREDIT_LIMIT_MULTIPLIER;
        }else if((500 <= creditScore && creditScore < 1000) && salary < 5000){
            creditLimit = 10000;
        }else if((500 <= creditScore && creditScore < 1000) && salary >= 5000){
            creditLimit = 20000;
        }else {
            status = Status.REJECTED;
        }
        Long creditId = helperSaveCreditApplication(id, status, creditLimit);
        Optional<Credit> credit = creditDao.getCredit(creditId);
        return CreditService.valueOf(credit.get());
    }

    private Long helperSaveCreditApplication(String id, Status status, double amount){
        Credit credit = new Credit();
        credit.setUser(userDao.getUser(1L));
        credit.setStatus(status);
        if (amount != 0)
            credit.setAmountCredit(amount);
        return  creditDao.save(credit);
    }
}

