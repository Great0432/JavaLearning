package A09_Classes.B01_Object;

import java.util.Objects;

public class Student_idea {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {

        //如果两个对象地址相同，里面的内容肯定相同，直接返回true
        if (this == o) return true;

        //代码如果能走到这里，则两者地址肯定不相同， 而且this肯定不是null，否则会空指针异常

        //如果o是null，直接返回false

        //this.getClass() != o.getClass() : 省略了this,用于比较两个对象的字节码是否相同
        //如果字节码不相同,意味着类型不相同,直接返回false
        if (o == null || getClass() != o.getClass()) return false;

        //代码如果能够走到这里,代表字节码相同, 类型肯定相同
        //向下转型
        Student_idea that = (Student_idea) o;
        //比较(依旧省略了this)
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    public Student_idea() {
    }

    public Student_idea(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student_idea{name = " + name + ", age = " + age + "}";
    }
}
