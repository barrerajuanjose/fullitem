package com.jj.probing.fullitem.repositories.rest;

import com.google.common.collect.ImmutableMap;
import com.jj.probing.fullitem.domains.PaymentOptions;
import com.jj.probing.fullitem.usecases.port.PaymentOptionsRepository;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class PaymentOptionsRestRepository implements PaymentOptionsRepository {
    private final String URL = "https://api.mercadolibre.com/items/{itemId}/payment_options";

    @Override
    public CompletableFuture<PaymentOptions> findByItemId(String itemId) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = ImmutableMap.of("itemId", itemId);

        return CompletableFuture.completedFuture(restTemplate.getForObject(URL, PaymentOptions.class, params));
    }
}
