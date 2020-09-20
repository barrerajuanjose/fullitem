package com.jj.probing.fullitem.config.spring;

import com.jj.probing.fullitem.repositories.rest.ItemRestRepository;
import com.jj.probing.fullitem.usecases.FindItem;
import com.jj.probing.fullitem.usecases.port.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class SpringConfig {
    public FindItem createFindItem() {
        ItemRepository itemRepository = new ItemRestRepository();

        return new FindItem(itemRepository);
    }
}
