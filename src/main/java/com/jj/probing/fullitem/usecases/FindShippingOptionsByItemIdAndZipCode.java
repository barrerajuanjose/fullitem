package com.jj.probing.fullitem.usecases;

import com.jj.probing.fullitem.domains.ShippingOptions;
import com.jj.probing.fullitem.usecases.port.ShippingOptionsRepository;

import java.util.Optional;

public class FindShippingOptionsByItemIdAndZipCode {
    private ShippingOptionsRepository shippingOptionsRepository;

    public FindShippingOptionsByItemIdAndZipCode(ShippingOptionsRepository shippingOptionsRepository) {
        this.shippingOptionsRepository = shippingOptionsRepository;
    }

    public Optional<ShippingOptions> findByItemId(String itemId, String zipCode) {
        return shippingOptionsRepository.findByItemIdAndZipCode(itemId, zipCode);
    }
}
