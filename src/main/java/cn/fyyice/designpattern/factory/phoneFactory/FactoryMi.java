package cn.fyyice.designpattern.factory.phoneFactory;

import cn.fyyice.designpattern.factory.entity.Xiaomi;

public class FactoryMi implements PhoneFactory {
    @Override
    public Xiaomi createPhone() {
        return new Xiaomi();
    }
}
