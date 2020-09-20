package com.jj.probing.fullitem.usecases.port;

import com.jj.probing.fullitem.domains.PaymentOptions;

import java.util.Optional;

public interface PaymentOptionsRepository {
    Optional<PaymentOptions> findByItemId(String itemId);
}
