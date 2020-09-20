package com.jj.probing.fullitem.repositories.rest;

import com.google.common.collect.ImmutableMap;
import com.jj.probing.fullitem.domains.ShippingOptions;
import com.jj.probing.fullitem.usecases.port.ShippingOptionsRepository;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ShippingOptionsRestRepository implements ShippingOptionsRepository {
    private final String URL = "https://api.mercadolibre.com/items/{itemId}/shipping_options?zip_code={zipCode}";

    @Override
    public Optional<ShippingOptions> findByItemIdAndZipCode(String itemId, String zipCode) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = ImmutableMap.of("itemId", itemId, "zipCode", Objects.requireNonNullElse(zipCode, "1430"));

        return Optional.ofNullable(restTemplate.getForObject(URL, ShippingOptions.class, params));
    }
}
