package com.jj.probing.fullitem.fetchers;

import com.jj.probing.fullitem.domains.Item;
import com.jj.probing.fullitem.usecases.FindItem;
import com.jj.probing.fullitem.usecases.FindPaymentOptionsByItemId;
import com.jj.probing.fullitem.usecases.FindShippingOptionsByItemIdAndZipCode;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GraphQLDataFetchers {

    @Autowired
    private FindItem findItem;

    @Autowired
    private FindPaymentOptionsByItemId findPaymentOptionsByItemId;

    @Autowired
    private FindShippingOptionsByItemIdAndZipCode findShippingOptionsByItemIdAndZipCode;

    public DataFetcher getItemByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String id = dataFetchingEnvironment.getArgument("id");
            return findItem.find(id);
        };
    }

    public DataFetcher getPaymentOptionsByItemIdDataFetcher() {
        return dataFetchingEnvironment -> {
            Item item = dataFetchingEnvironment.getSource();
            return findPaymentOptionsByItemId.findByItemId(item.getId());
        };
    }

    public DataFetcher getShippingOptionsByItemIdAndZipCodeDataFetcher() {
        return dataFetchingEnvironment -> {
            Item item = dataFetchingEnvironment.getSource();
            String zipCode = dataFetchingEnvironment.getArgument("zip_code");
            return findShippingOptionsByItemIdAndZipCode.findByItemId(item.getId(), zipCode);
        };
    }
}