package com.assessment.test;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RewardService {

    public int getRewardsByTransaction(TransactionModel transaction){
        List<Integer> transactions =  transaction.getTransactions();
        int reward = 0;

        for(int trans: transactions){
            if(trans <= 50) {
                continue;
            }
            int rewardEligible = trans - 50;

            int twoPointsEligible = rewardEligible - 50;

            if(twoPointsEligible > 0){
                reward += 2 * twoPointsEligible;
            }

            if(rewardEligible > 50){
                reward += 50;
            }else{
                reward += rewardEligible;
            }

        }
        return reward;
    }
}
