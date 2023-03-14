package cn.fyyice.designpattern.strategy.service;

import cn.fyyice.designpattern.strategy.service.design.OrderStrategyService;
import org.springframework.stereotype.Component;

@Component("orderPhone")
public class OrderPhoneServiceImpl  implements OrderStrategyService {
    @Override
    public String perOrderTreatment() {
        System.out.println("手机订单预处理");
        return "手机订单预处理";
    }
}
