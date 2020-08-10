package com.thiethaa.config_xmlbased;

public class Iphone implements MobilePhone{
    private long serialNo;
    private String type;

    public long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void takePic(){
        System.out.println("taking picture using Iphone camera...");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "serialNo=" + serialNo +
                ", type='" + type + '\'' +
                '}';
    }
}
