package com.jj.probing.fullitem.repositories.rest;

import com.google.common.collect.ImmutableMap;
import com.jj.probing.fullitem.domains.Item;
import com.jj.probing.fullitem.usecases.port.ItemRepository;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;

public class ItemRestRepository implements ItemRepository {

    private final String URL = "https://api.mercadolibre.com/items/{id}";

    @Override
    public Optional<Item> findById(String id) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = ImmutableMap.of("id", id);

        return Optional.ofNullable(restTemplate.getForObject(URL, Item.class, params));
    }
}
