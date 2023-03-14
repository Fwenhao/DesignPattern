package cn.fyyice.designpattern.proxy.service.impl;

import cn.fyyice.designpattern.proxy.service.RentalService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class CDRentalServiceImpl implements RentalService {

    @Override
    public Map<String, Object> rentalHouse() {

        //前置操作
        LocalDateTime pre = preTime();
        System.out.println("狗逼中间商赚个差价");
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //后置操作
        LocalDateTime after = afterTime();

        Map<String, Object> map = new HashMap<>();
        map.put("per",pre);
        map.put("msg","成都租房");
        map.put("after",after);
        return map;
    }

    public LocalDateTime preTime(){
        return LocalDateTime.now();
    }


    public LocalDateTime afterTime(){
        return LocalDateTime.now();
    }


}
