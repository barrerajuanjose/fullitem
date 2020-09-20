package com.jj.probing.fullitem.usecases;

import com.jj.probing.fullitem.domains.PaymentOptions;
import com.jj.probing.fullitem.usecases.port.PaymentOptionsRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

public class FindPaymentOptionsByItemId {
    private PaymentOptionsRepository paymentOptionsRepository;

    public FindPaymentOptionsByItemId(PaymentOptionsRepository paymentOptionsRepository) {
        this.paymentOptionsRepository = paymentOptionsRepository;
    }

    @Async
    public CompletableFuture<PaymentOptions> findByItemId(String itemId) {
        return paymentOptionsRepository.findByItemId(itemId);
    }
}
