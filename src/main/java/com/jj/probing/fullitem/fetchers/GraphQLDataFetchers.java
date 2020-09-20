package com.jj.probing.fullitem.fetchers;

import com.jj.probing.fullitem.usecases.FindItem;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GraphQLDataFetchers {

    @Autowired
    private FindItem findItem;

    public DataFetcher getItemByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String id = dataFetchingEnvironment.getArgument("id");
            return findItem.find(id);
        };
    }
}