package com.zosh.trading.repository;

import com.zosh.trading.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Wallet findByUserId (Long userId);
}
