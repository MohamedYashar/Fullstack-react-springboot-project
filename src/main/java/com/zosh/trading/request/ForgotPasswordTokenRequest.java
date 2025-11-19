package com.zosh.trading.request;

import com.zosh.trading.domain.VerificationType;
import lombok.Data;

@Data

public class ForgotPasswordTokenRequest {

    private String sendTo;
    private VerificationType verificationType;
}
