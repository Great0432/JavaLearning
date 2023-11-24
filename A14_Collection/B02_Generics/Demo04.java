package A14_Collection.B02_Generics;

import java.util.ArrayList;

public class Demo04 {
    /*
        泛型通配符 :

            ? : 任意类型

            ? extends E : 可以传入的是E, 或者是E的子类

            ? super E : 可以传入的是E, 或者是E的父类
     */
    public static void main(String[] args) {

        ArrayList<Coder> list1 = new ArrayList<>();
        list1.add(new Coder());

        ArrayList<Manager> list2 = new ArrayList<>();
        list2.add(new Manager());

        method(list1);
        method(list2);

    }
    
    public static void method(ArrayList<? extends Employee> list){
        for (Employee e : list) {
            e.work();
        }
    }
}

abstract class Employee {
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void work();

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
        return "Employee{name = " + name + ", age = " + age + "}";
    }
}

class Coder extends Employee {

    @Override
    public void work() {
        System.out.println("程序员敲代码...");
    }
}

class Manager extends Employee{

    @Override
    public void work() {
        System.out.println("经理研发产品...");
    }
}