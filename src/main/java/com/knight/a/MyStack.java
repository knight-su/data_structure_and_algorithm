package com.knight.a;

public interface MyStack<T> {

    /**
     * 入栈操作
     * @param value
     */
    void push(T value);


    /**
     * 出栈操作(弹栈)
     * @return
     */
    T pop();

    /**
     * 获取当前元素数
     * @return
     */
    int getSize();

    /**
     * 是否为空栈
     * @return
     */
    boolean isEmpty();

    /**
     * 清空栈操作
     */
    void clear();
}
