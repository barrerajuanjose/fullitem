package com.jj.probing.fullitem.config.spring;

import com.jj.probing.fullitem.repositories.rest.ItemRestRepository;
import com.jj.probing.fullitem.repositories.rest.PaymentOptionsRestRepository;
import com.jj.probing.fullitem.repositories.rest.ShippingOptionsRestRepository;
import com.jj.probing.fullitem.usecases.FindItem;
import com.jj.probing.fullitem.usecases.FindPaymentOptionsByItemId;
import com.jj.probing.fullitem.usecases.FindShippingOptionsByItemIdAndZipCode;
import com.jj.probing.fullitem.usecases.port.ItemRepository;
import com.jj.probing.fullitem.usecases.port.PaymentOptionsRepository;

public class SpringConfig {
    private final ItemRepository itemRepository = new ItemRestRepository();
    private final PaymentOptionsRepository paymentOptionsRepository = new PaymentOptionsRestRepository();
    private final ShippingOptionsRestRepository shippingOptionsRestRepository = new ShippingOptionsRestRepository();

    public FindItem createFindItem() {
        return new FindItem(itemRepository);
    }

    public FindPaymentOptionsByItemId createFindPaymentOptionsByItemId() {
        return new FindPaymentOptionsByItemId(paymentOptionsRepository);
    }

    public FindShippingOptionsByItemIdAndZipCode createFindShippingOptionsByItemIdAndZipCode() {
        return new FindShippingOptionsByItemIdAndZipCode(shippingOptionsRestRepository);
    }
}
