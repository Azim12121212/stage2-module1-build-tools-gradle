package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        int counter = 0;
        for (String s: args) {
            if (Integer.parseInt(s)>0) {
                counter++;
            }
        }
        return counter==args.size();
    }
}