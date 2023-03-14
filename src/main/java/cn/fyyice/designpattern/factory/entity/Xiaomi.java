package cn.fyyice.designpattern.factory.entity;

public class Xiaomi extends Phone{
    public Xiaomi() {
        System.out.println("Made by Xiaomi");
    }

    private String xiaomiCode;

    public String getXiaomiCode() {
        return xiaomiCode;
    }

    public void setXiaomiCode(String xiaomiCode) {
        this.xiaomiCode = xiaomiCode;
    }
}
