package com.jj.probing.fullitem.usecases.port;

import com.jj.probing.fullitem.domains.Item;

import java.util.concurrent.CompletableFuture;

public interface ItemRepository {
    CompletableFuture<Item> findById(String id);
}
