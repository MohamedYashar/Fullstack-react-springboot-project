package com.zosh.trading.model;

import com.zosh.trading.domain.VerificationType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class ForgetPasswordToken {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private String Id;

    @OneToOne
    private User user;

    private String otp;

    private VerificationType verificationType;

    private String sendTo;

}
