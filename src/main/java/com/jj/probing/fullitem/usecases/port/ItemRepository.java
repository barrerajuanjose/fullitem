package com.jj.probing.fullitem.usecases.port;

import com.jj.probing.fullitem.domains.Item;

import java.util.Optional;

public interface ItemRepository {
    Optional<Item> findById(String id);
}
