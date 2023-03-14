package cn.fyyice.designpattern.factory.service.impl;

import cn.fyyice.designpattern.factory.entity.Xiaomi;
import cn.fyyice.designpattern.factory.phoneFactory.FactoryMi;
import cn.fyyice.designpattern.factory.service.PhoneService;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component("xiaomi")
public class XiaomiServiceImpl implements PhoneService {
    @Override
    public String manufacture() {
        FactoryMi factoryMi = new FactoryMi();
        Xiaomi xiaomi = factoryMi.createPhone();
        xiaomi.setXiaomiCode(UUID.randomUUID().toString().substring(0,8));
        return "Xiaomi:"+xiaomi.getXiaomiCode()+"->开始制造";
    }

    @Override
    public String purchase() {
        return "开始采购小米手机";
    }
}
