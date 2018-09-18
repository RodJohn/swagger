package com.john.rod.booting;

public class Utils {

    public static  <T> T  getOrDefault  (T in ,T def){
        return in==null?def:in;
    }


}
