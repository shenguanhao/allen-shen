package com.shengh.util;

import org.apache.logging.log4j.util.Strings;

public class TestUtil {
    public static String println(String aa){
        System.out.println(aa);
        return "33";
    }

    public static void main(String[] args) {
        testBlank();
    }
    public static void testBlank(){
        System.out.println(Strings.isNotEmpty(" "));
        System.out.println(Strings.isNotBlank(" "));
    }
}
