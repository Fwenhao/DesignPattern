package cn.fyyice.designpattern.factory.entity;

/**
 * 不同品牌手机各项指标功能不一样
 */
public abstract class Phone {

    Phone (){}

    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
