package A14_Collection.B01_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListDemo {

    /*
        List接口的特点 : 存取有序, 有索引, 可以存储重复的
     */

    //并发修改异常
    /*
        ConcurrentModificationException : 并发修改异常

        场景 : 使用[迭代器]遍历集合的过程中, 调用了[集合对象]的添加, 删除方法, 就会出现此异常

        解决方案 : 迭代器的遍历过程中, 不允许使用集合对象的添加或删除, 就使用迭代器自己的添加或删除方法

            删除方法 : 普通的迭代器有
            添加方法 : 需要使用List特有的迭代器
     */

    public static void main(String[] args) {

        List<String > list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String s = it.next();
            if("bbb".equals(s)) {
                //list.remove(s);   会引发异常
                it.remove();
                it.add("ddd");
            }
        }
        System.out.println(list);
    }
}
