package com.thiethaa.config_xmlbased;

public class MobilePhoneInstanceFactory {
    public MobilePhoneInstanceFactory() {
    }

    public MobilePhone getMobilePhone(String phoneType){
        MobilePhone mobilePhone = null ;

        if(phoneType.equalsIgnoreCase("samsung")){
            mobilePhone= new Samsung();
        }if(phoneType.equalsIgnoreCase("iphone")){
            mobilePhone= new Iphone();
        }
        return mobilePhone;
    }
}
