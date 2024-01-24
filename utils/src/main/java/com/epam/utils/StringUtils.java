package com.epam.utils;

//import org.apache.commons.lang3.StringUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         return Integer.parseInt(str)>0;
    }
    public static void main(String[] args) {
        System.out.println(isPositiveNumber("1"));
    }
}
