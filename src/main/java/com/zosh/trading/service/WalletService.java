package com.zosh.trading.service;

import com.zosh.trading.model.Order;
import com.zosh.trading.model.User;
import com.zosh.trading.model.Wallet;

public interface WalletService {

    Wallet getUserWallet (User user);

    Wallet addBalance(Wallet wallet, Long money);

    Wallet findWalletById( Long id) throws Exception;

    Wallet wallettowalletTransfer (User sender, Wallet receiverWallet, Long amount) throws Exception;

    Wallet payorderPayment(Order order, User user) throws Exception;

}
