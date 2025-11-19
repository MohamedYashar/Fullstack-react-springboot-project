package com.zosh.trading.repository;

import com.zosh.trading.model.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository <PaymentDetails, Long> {

    PaymentDetails findByUserId( Long userId);
}
