package com.pong.moneyrate;

import com.pong.moneyrate.feature.list.data.ExchangeListRepositories;
import com.pong.moneyrate.feature.list.data.ExchangeListRepository;

/**
 * Created by User on 27/7/2560.
 */

public class Injection {
    public static ExchangeListRepository provideExchangeListRepository() {
        return ExchangeListRepositories.getRepository(new MockExchangeListService());
    }
}
