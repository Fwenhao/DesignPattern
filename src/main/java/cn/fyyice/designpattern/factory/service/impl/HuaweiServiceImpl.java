package cn.fyyice.designpattern.factory.service.impl;

import cn.fyyice.designpattern.factory.entity.Huawei;
import cn.fyyice.designpattern.factory.phoneFactory.FactoryHuawei;
import cn.fyyice.designpattern.factory.service.PhoneService;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component("huawei")
public class HuaweiServiceImpl implements PhoneService {
    @Override
    public String manufacture() {
        FactoryHuawei phoneFactory = new FactoryHuawei();
        Huawei huawei = phoneFactory.createPhone();
        huawei.setMobileCode(UUID.randomUUID().toString().substring(0,8));
        return "Huawei:"+huawei.getMobileCode()+"->开始制造";
    }

    @Override
    public String purchase() {
        return "开始采购华为手机";
    }
}
