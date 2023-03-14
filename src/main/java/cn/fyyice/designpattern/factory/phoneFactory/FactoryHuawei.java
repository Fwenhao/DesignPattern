package cn.fyyice.designpattern.factory.phoneFactory;

import cn.fyyice.designpattern.factory.entity.Huawei;

public class FactoryHuawei implements PhoneFactory{
    @Override
    public Huawei createPhone() {
        /*
         * ****
         * 此处为创建时涉及到的逻辑
         * */
        return new Huawei();
    }
}
