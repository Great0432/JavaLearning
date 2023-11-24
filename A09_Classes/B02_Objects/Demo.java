package A09_Classes.B02_Objects;


import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        /*
            和Object中的equals方法一样比较地址值,但是多了一个非空判断

            public static boolean equals(Object a, Object b) {

                                ||具有短路效果,左边为true, 右边不执行
                                  --如果地址相同,直接返回为true
                                              &&左边为false的话, 右边不执行, 避免了空指针异常
                return (a == b) || (a != null && a.equals(b));
            }

         */

        Student stu1 = new Student("Tom",15);
        Student stu2 = new Student("Tom",15);

        System.out.println(Objects.equals(stu1, stu2));

    }
}
