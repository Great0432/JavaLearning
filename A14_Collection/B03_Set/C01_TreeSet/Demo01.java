package A14_Collection.B03_Set.C01_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo01 {
    /*
        TreeSet集合的特点 : 排序, 去重

            compareTo 方法的返回值 :
                0 : 只有第一个元素
                正数 : 正序排列
                负数 : 逆序排列

            如果同时具备比较器和自然排序, 会优先按照比较器的规则进行排序操作
     */
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //逆序排序
                int ageResult = o2.getAge() - o1.getAge();
                int nameResult = ageResult == 0 ? o2.getName().compareTo(o1.getName()) : ageResult;
                return nameResult == 0 ? 1 : nameResult;
            }
        });

        set.add(new Student("One",11));
        set.add(new Student("Three1",33));
        set.add(new Student("Three2",33));
        set.add(new Student("Two",22));
        set.add(new Student("Two",22));

        System.out.println(set);

    }
}
