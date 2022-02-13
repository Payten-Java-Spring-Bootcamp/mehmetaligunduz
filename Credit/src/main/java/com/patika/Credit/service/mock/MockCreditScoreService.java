package com.patika.Credit.service.mock;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MockCreditScoreService {

    private final Map<String, Integer> scores = new HashMap<>();

    public MockCreditScoreService() {
    }

    public int getScore(String id){
        if (!scores.containsKey(id))
            return add2Map(id);
        return scores.get(id);
    }

    //Credit score is between 0 - 1900
    private int helperGenerateScore(){
        return new Random().nextInt(1901);
    }

    //It is a mock so we have to guarantee that
    //related id have a credit score
    private int add2Map(String id){
        scores.put(id, helperGenerateScore());
        return scores.get(id);
    }
}
