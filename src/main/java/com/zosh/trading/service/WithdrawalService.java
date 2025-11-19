package com.zosh.trading.service;

import com.zosh.trading.model.User;
import com.zosh.trading.model.Withdrawal;

import java.util.List;

public interface WithdrawalService {

    Withdrawal  requestWithdrawal(Long amount, User user);

    Withdrawal proceedWithdrawal(Long withdrawalId, boolean accept) throws Exception;

    List<Withdrawal> getUsersWithdrawalHistory (User user);

    List<Withdrawal> getAllWithdrawalRequest();
}
