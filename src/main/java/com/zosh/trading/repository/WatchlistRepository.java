package com.zosh.trading.repository;

import com.zosh.trading.model.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {

    Watchlist findByUserId(Long userId);

}
