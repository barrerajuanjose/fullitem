package com.jj.probing.fullitem.usecases;

import com.jj.probing.fullitem.domains.Item;
import com.jj.probing.fullitem.usecases.port.ItemRepository;

import java.util.Optional;

public class FindItem {

    private ItemRepository itemRepository;

    public FindItem(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Optional<Item> find(String id) {
        return itemRepository.findById(id);
    }
}
