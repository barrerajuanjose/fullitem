package com.jj.probing.fullitem.usecases.port;

import com.jj.probing.fullitem.domains.ShippingOptions;

import java.util.concurrent.CompletableFuture;

public interface ShippingOptionsRepository {
    CompletableFuture<ShippingOptions> findByItemIdAndZipCode(String itemId, String zipCode);
}
