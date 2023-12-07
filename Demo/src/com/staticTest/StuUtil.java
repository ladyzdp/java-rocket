package com.staticTest;

import java.util.ArrayList;

public class StuUtil {

    private StuUtil() {
    }

    public static int getMaxAge(ArrayList<Students> arr) {
        int max = arr.get(0).getAge();

        for (int i = 0; i < arr.size(); i++) {
            int item = arr.get(i).getAge();
            if (item > max) {
                max = item;
            }
        }

        return max;
    }


}
