package com.jj.probing.fullitem.usecases;

import com.jj.probing.fullitem.domains.ShippingOptions;
import com.jj.probing.fullitem.usecases.port.ShippingOptionsRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

public class FindShippingOptionsByItemIdAndZipCode {
    private ShippingOptionsRepository shippingOptionsRepository;

    public FindShippingOptionsByItemIdAndZipCode(ShippingOptionsRepository shippingOptionsRepository) {
        this.shippingOptionsRepository = shippingOptionsRepository;
    }

    @Async
    public CompletableFuture<ShippingOptions> findByItemId(String itemId, String zipCode) {
        return shippingOptionsRepository.findByItemIdAndZipCode(itemId, zipCode);
    }
}
