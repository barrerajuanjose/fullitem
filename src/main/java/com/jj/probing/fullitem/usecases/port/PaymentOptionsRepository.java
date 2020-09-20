package com.jj.probing.fullitem.usecases.port;

import com.jj.probing.fullitem.domains.PaymentOptions;

import java.util.concurrent.CompletableFuture;

public interface PaymentOptionsRepository {
    CompletableFuture<PaymentOptions> findByItemId(String itemId);
}
