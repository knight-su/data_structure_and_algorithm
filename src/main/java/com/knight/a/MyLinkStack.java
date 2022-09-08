package com.knight.a;


public class MyLinkStack<T> implements MyStack<T>{

    /**
     * 头节点
     */
    private Node<T> first;

    /**
     * 尾节点
     */
    private Node<T> last;

    /**
     * 当前元素的个数
     */
    private int size = 0;

    /**
     * 构造函数
     */
    public MyLinkStack() {

    }

    /**
     * 节点元素定义
     * @param <T>
     */
    private static class Node<T> {

        /**
         * 存储的数据内容
         */
        private T item;

        /**
         * 前驱节点
         */
        private Node<T> prev;

        /**
         * 后继节点
         */
        private Node<T> next;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }
    }


    /**
     * 俩种方式的玩法 1.全部链在头节点，弹栈的时候也从头节点出去；2.全部链在尾节点，弹栈的时候也从尾节点出去
     * @param value
     */
    public void push(T value) {
        if(first == null) {
            Node node = new Node<T>(null,value,null);
            first = node;
        }
    }

    public T pop() {
        return null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void clear() {

    }
}
