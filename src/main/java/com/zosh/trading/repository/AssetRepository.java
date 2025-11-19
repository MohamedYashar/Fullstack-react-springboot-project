package com.zosh.trading.repository;

import com.zosh.trading.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository <Asset, Long> {

    List<Asset> findByUserId(Long userId);

    Asset findAssetByUserIdAndCoinId(Long userId, String coinId);


}
