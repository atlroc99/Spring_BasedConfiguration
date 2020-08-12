package com.thiethaa.config_xmlbased;

public class MobilePhoneFactory {

    public MobilePhoneFactory() {
    }

    public static MobilePhone getHp(){
        return new Samsung();
    }

    public static MobilePhone getPhone(String phoneType){
        MobilePhone mobilePhone = null ;

        if(phoneType.equalsIgnoreCase("samsung")){
            mobilePhone= new Samsung();
        }if(phoneType.equalsIgnoreCase("iphone")){
            mobilePhone= new Iphone();
        }
        return mobilePhone;
    }

}
