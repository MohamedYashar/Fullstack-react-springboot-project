package com.zosh.trading.service;

import com.zosh.trading.domain.VerificationType;
import com.zosh.trading.model.User;
import com.zosh.trading.model.VerificationCode;

public interface VerificationCodeService {

    VerificationCode sendVerificationCode(User user, VerificationType verificationType);

    VerificationCode getVerificationCodeById (Long id) throws Exception;

    VerificationCode getVerificationCodeByUser(Long userId );

    void deleteVerificationCodeById (VerificationCode verificationCode);

}
