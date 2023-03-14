package cn.fyyice.designpattern.factory.entity;

public class Huawei extends Phone{

    public Huawei() {
        System.out.println("Made by Huawei");
    }

    private String mobileCode;

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }
}
