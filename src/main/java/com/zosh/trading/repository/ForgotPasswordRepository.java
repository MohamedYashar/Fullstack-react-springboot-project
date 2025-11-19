package com.zosh.trading.repository;

import com.zosh.trading.model.ForgetPasswordToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForgotPasswordRepository extends JpaRepository <ForgetPasswordToken, String> {


    ForgetPasswordToken findByuserId ( Long userId);
}
