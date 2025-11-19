package com.zosh.trading.service;

import com.zosh.trading.model.PaymentDetails;
import com.zosh.trading.model.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(String accountNumber,
                                            String accountHolderName,
                                            String ifsc,
                                            String bankName,
                                            User user);

    public PaymentDetails getUsersPaymentDetails (User user);

}
