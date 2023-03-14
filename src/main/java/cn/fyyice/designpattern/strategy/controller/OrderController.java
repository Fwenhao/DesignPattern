package cn.fyyice.designpattern.strategy.controller;

import cn.fyyice.designpattern.strategy.entity.Order;
import cn.fyyice.designpattern.strategy.service.OrderStrategyContext;
import cn.fyyice.designpattern.strategy.service.design.OrderStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderStrategyContext orderStrategyContext;

    @RequestMapping(value = "/pre", method = RequestMethod.POST)
    public String preOption (Order order){
        OrderStrategyService orderStrategyService = orderStrategyContext.returnResources(order);
        String msg = orderStrategyService.perOrderTreatment();
        return msg;
    }

}
