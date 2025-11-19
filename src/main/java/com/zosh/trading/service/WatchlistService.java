package com.zosh.trading.service;

import com.zosh.trading.model.Coin;
import com.zosh.trading.model.User;
import com.zosh.trading.model.Watchlist;

public interface WatchlistService {


    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchlist( User user);

    Watchlist findById(Long id) throws Exception;


    Coin addItemToWatchlist( Coin coin, User user) throws Exception;

}
