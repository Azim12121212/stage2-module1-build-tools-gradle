package com.epam.utils;

//import org.apache.commons.lang3.StringUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         if (str.isEmpty() || str==null) {
             return false;
         }
         try {
             return Double.parseDouble(str)>0;
         }
         catch (NumberFormatException e) {
             e.printStackTrace();
             return false;
         }
    }
    public static void main(String[] args) {
        System.out.println(isPositiveNumber("1"));
    }
}
