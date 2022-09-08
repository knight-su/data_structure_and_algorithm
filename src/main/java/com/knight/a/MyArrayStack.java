package com.knight.a;

public class MyArrayStack<T> implements MyStack<T>{

    /**
     * 内部真正的实现的数据形式 数组也就是顺序存储结构
     */
    private Object[] elementData;

    /**
     * 当前栈内元素的数量
     */
    private int size;

    /**
     * 数组最大可支撑的容量
     */
    private int capacity;

    /**
     * 当前指向栈顶的数组下标
     */
    private int top;

    /**
     * 构造该栈的时候需要指明栈的容量
     * @param capacity
     */
    public MyArrayStack(int capacity) {
        this.capacity = capacity;
        elementData = new Object[capacity];
        size = 0;
        top = 0;
    }

    public void push(T value) {
        //随着入栈的操作，栈内的元素数量和top指针也得增加
        elementData[size] = value;
        size++;
        top= size-1;

    }

    public T pop() {
        if(size == 0) {
            return null;
        }
        //随着弹栈的操作，数组内的最后一个元素会remove掉，同时size数量和top指针也要下调
        T t = (T) elementData[top];
        elementData[top] = null;
        top--;
        size--;
        return t;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elementData = new Object[capacity];
        size = 0;
    }
}
