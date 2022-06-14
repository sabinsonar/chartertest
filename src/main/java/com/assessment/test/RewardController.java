package com.assessment.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rewards")
public class RewardController {

    @Autowired
    private RewardService rewardService;


    @PostMapping
    public int getRewardsByTransactions(@RequestBody TransactionModel transaction){

        return rewardService.getRewardsByTransaction(transaction);
    }


}
