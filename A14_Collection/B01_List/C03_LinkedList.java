package A14_Collection.B01_List;

import java.util.LinkedList;

public class C03_LinkedList {
    /*
        LinkedList 底层是 双向链表

        特有方法 :
            void addFirst(E e) :   头部添加
            void addLast(E e) :    尾部添加
            E getFirst() :         获取第一个
            E getLast() :          获取最后一个
            E removeFirst() :      删除第一个
            E removeLast() :       删除最后一个
     */
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.addFirst("aaa");
        list.addFirst("bbb");
        list.addLast("ccc");
        System.out.println(list);

        System.out.println("------------------");

        String first = list.getFirst();
        System.out.println(first);
        String last = list.getLast();
        System.out.println(last);

        System.out.println("------------------");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }


}
