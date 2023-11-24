package A09_Classes.B01_Object;

public class Demo {
    public static void main(String[] args) {
        /*
            Object类中的equals方法，默认比较的是对象的内存地址
         */

        Student stu1 = new Student("Tom",15);
        Student stu2 = new Student("Tom",15);

        System.out.println(stu1.equals(stu2));

    }
}
