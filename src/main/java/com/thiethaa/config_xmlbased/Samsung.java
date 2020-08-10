package com.thiethaa.config_xmlbased;

import java.beans.ConstructorProperties;

public class Samsung implements MobilePhone {
    private long serialNo;
    private String type;

    public Samsung() {
    }

    public Samsung(long serialNo, String type) {
        this.serialNo = serialNo;
        this.type = type;
    }

    public void takePic(){
        System.out.println("taking picture using Samsung camera...");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "serialNo=" + serialNo +
                ", type='" + type + '\'' +
                '}';
    }
}
