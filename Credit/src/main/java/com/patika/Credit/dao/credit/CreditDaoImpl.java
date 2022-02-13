package com.patika.Credit.dao.credit;

import com.patika.Credit.common.enumeration.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CreditDaoImpl implements CreditDao {

    private final CreditRepository creditRepository;

    @Override
    public Status getStatus(String id) {
        return creditRepository.findLastApplicationByTRIdNumber(id).stream().findFirst().get().getStatus();
    }

    @Override
    public double getAmountCredit(String id) {
        return creditRepository.findLastApplicationByTRIdNumber(id).stream().findFirst().get().getAmountCredit();
    }

    @Override
    public Optional<Credit> getCredit(Long id) {
        return creditRepository.findById(id);
    }

    @Override
    public Long save(Credit credit) {
        return creditRepository.save(credit).getId();
    }

    @Override
    public Credit getLastCreditByTRIdNumber(String id) {
        return creditRepository.findLastApplicationByTRIdNumber(id).stream().findFirst().get();
    }
}
