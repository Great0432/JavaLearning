package A14_Collection.B03_Set.C02_HashSet;

import java.util.HashSet;

public class Demo01 {
    /*
        HashSet
            如果想要去重, 必须重写 equals 和 hashcode 方法
     */
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        set.add(new Student("张三",33));
        set.add(new Student("李四",44));
        set.add(new Student("王五",55));
        set.add(new Student("王五",55));

        System.out.println(set);

    }
}
