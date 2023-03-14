package cn.fyyice.designpattern.strategy.service;

import cn.fyyice.designpattern.strategy.service.design.OrderStrategyService;
import org.springframework.stereotype.Component;

@Component("orderFood")
public class OrderFoodServiceImpl implements OrderStrategyService {

    @Override
    public String perOrderTreatment() {
        System.out.println("食品订单预处理");
        return "食品订单预处理";
    }

}
