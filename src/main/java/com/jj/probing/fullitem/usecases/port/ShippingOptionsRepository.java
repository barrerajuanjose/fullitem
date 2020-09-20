package com.jj.probing.fullitem.usecases.port;

import com.jj.probing.fullitem.domains.ShippingOptions;

import java.util.Optional;

public interface ShippingOptionsRepository {
    Optional<ShippingOptions> findByItemIdAndZipCode(String itemId, String zipCode);
}
