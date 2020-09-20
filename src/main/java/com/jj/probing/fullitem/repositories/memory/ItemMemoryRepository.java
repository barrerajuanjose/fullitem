package com.jj.probing.fullitem.repositories.memory;

import com.jj.probing.fullitem.domains.Item;
import com.jj.probing.fullitem.usecases.port.ItemRepository;

import java.util.Optional;

public class ItemMemoryRepository implements ItemRepository {

    @Override
    public Optional<Item> findById(String id) {
        Item item = new Item();
        item.setId(id);

        return Optional.of(item);
    }
}
