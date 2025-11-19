package com.zosh.trading.service;

import com.zosh.trading.domain.VerificationType;
import com.zosh.trading.model.ForgetPasswordToken;
import com.zosh.trading.model.User;

public interface ForgotPasswordService {

    ForgetPasswordToken createToken(User user,
                                    String id, String otp,
                                    VerificationType verificationType,
                                    String sendTo);

    ForgetPasswordToken findById (String id);

    ForgetPasswordToken findByUser (Long userId);

    void deleteToken (ForgetPasswordToken token);



}
