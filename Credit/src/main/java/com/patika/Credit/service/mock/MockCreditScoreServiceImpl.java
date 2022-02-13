package com.patika.Credit.service.mock;

import org.springframework.stereotype.Service;

@Service
public class MockCreditScoreServiceImpl implements IMockCreditScoreService{
    private final MockCreditScoreService mockCreditScoreService;
    public MockCreditScoreServiceImpl() {
        this.mockCreditScoreService = new MockCreditScoreService();
    }
    @Override
    public int getScore(String id) {
       return mockCreditScoreService.getScore(id);
    }
}
