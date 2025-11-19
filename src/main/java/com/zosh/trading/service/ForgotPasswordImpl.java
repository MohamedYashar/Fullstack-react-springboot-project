package com.zosh.trading.service;

import com.zosh.trading.domain.VerificationType;
import com.zosh.trading.model.ForgetPasswordToken;
import com.zosh.trading.model.User;
import com.zosh.trading.repository.ForgotPasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ForgotPasswordImpl implements  ForgotPasswordService{



    @Autowired
    private ForgotPasswordRepository forgotPasswordRepository;


    @Override
    public ForgetPasswordToken createToken(User user,
                                           String id,String otp,
                                           VerificationType verificationType,
                                           String sendTo) {

        ForgetPasswordToken token = new ForgetPasswordToken();
        token.setUser(user);
        token.setSendTo(sendTo);
        token.setVerificationType(verificationType);
        token.setOtp(otp);
        token.setId(id);
        return forgotPasswordRepository.save(token);
    }

    @Override
    public ForgetPasswordToken findById(String id) {

        Optional<ForgetPasswordToken> token = forgotPasswordRepository.findById(id);
        return token.orElse(null);
    }

    @Override
    public ForgetPasswordToken findByUser(Long userId) {
        return forgotPasswordRepository.findByuserId((userId));
    }

    @Override
    public void deleteToken(ForgetPasswordToken token) {

        forgotPasswordRepository.delete(token);

    }
}
