package com.jj.probing.fullitem.usecases;

import com.jj.probing.fullitem.domains.PaymentOptions;
import com.jj.probing.fullitem.usecases.port.PaymentOptionsRepository;

import java.util.Optional;

public class FindPaymentOptionsByItemId {
    private PaymentOptionsRepository paymentOptionsRepository;

    public FindPaymentOptionsByItemId(PaymentOptionsRepository paymentOptionsRepository) {
        this.paymentOptionsRepository = paymentOptionsRepository;
    }

    public Optional<PaymentOptions> findByItemId(String itemId) {
        return paymentOptionsRepository.findByItemId(itemId);
    }
}
