package com.knight.a;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {



    public static void main(String[] args) {
//        new Stack<Integer>();
//
//        Integer[] a= {1,2,3,4,5};
//        a = new Integer[1];
//        System.arraycopy(a,5,a,4,1);

        MyArrayStack<Integer> ss = new MyArrayStack<Integer>(100);
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);

        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());

        new LinkedList<Object>();
    }
}
