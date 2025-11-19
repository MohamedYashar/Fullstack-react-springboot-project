package com.zosh.trading.service;

import com.zosh.trading.domain.OrderType;
import com.zosh.trading.model.Coin;
import com.zosh.trading.model.Order;
import com.zosh.trading.model.OrderItem;
import com.zosh.trading.model.User;

import java.util.List;

public interface OrderService {

    Order createOrder (User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById( Long orderId) throws Exception;

    List<Order> getAllOrdersOfUser(Long userId, OrderType orderType, String assetSymbol);

    Order processOrder (Coin coin, double quantity, OrderType orderType, User user) throws Exception;


}
