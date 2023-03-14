package cn.fyyice.designpattern.strategy.service;

import cn.fyyice.designpattern.strategy.entity.Order;
import cn.fyyice.designpattern.strategy.service.design.OrderStrategyService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class OrderStrategyContext {

    private final Map<String, OrderStrategyService> orderStrategyMap = new ConcurrentHashMap<>();

    public OrderStrategyContext(Map<String, OrderStrategyService> strategyMap) {
        this.orderStrategyMap.clear();
        strategyMap.forEach((k,v) -> {
            orderStrategyMap.put(k,v);
        });
    }

    public OrderStrategyService returnResources (Order order) {
        return orderStrategyMap.get(order.getOrderType());
    }
}
