package com.lighthouseshavedice.home.util;

public class UtilMethods {

    public static String capString(String str){
        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
        return cap;

    }
}
