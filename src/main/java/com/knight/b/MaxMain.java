package com.knight.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxMain {





    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());

        System.out.println("max:"+handleData(list));
    }




    private static Integer handleData(List<Integer> dataList) {
        if(dataList.size() == 0) {
            throw new IllegalArgumentException();
        }
        if(dataList.size() == 1) {
            return dataList.get(0);
        }
        if(dataList.size() == 2) {
            if(dataList.get(0) >= dataList.get(1)) {
                return dataList.get(0);
            }else {
                return dataList.get(1);
            }
        }
        int index = dataList.size() / 2;
        int a = handleData(dataList.subList(0, index));
        int b = handleData(dataList.subList(index, dataList.size() - 1));
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
