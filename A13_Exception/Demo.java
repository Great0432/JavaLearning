package A13_Exception;

import java.util.Scanner;

public class Demo {
    /*
        异常 : 程序再编译或执行过程中, 出现的非正常情况 (错误)

        阅读异常 : 从下往上看
            1. 找异常错误位置
            2. 异常名称
            3. 异常原因

        处理方法 :
            1. try...catch 捕获异常  --  异常对象可以被捕获, 后续的代码可以执行

                格式 :  catch语句可以写多个
                    try {
                        可能出现异常的代码
                    }catch (异常名称 对象名){
                        异常的处理方案
                    }catch (异常名称 对象名){
                        异常的处理方案
                    }

            2. throws 抛出异常

        注意 :
            子类重写父类方法时, 不能抛出父类没有的异常, 或者比父类更大的异常
            可以使用 try...catch
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        stu.setName(name);

        System.out.println("请输入学生年龄: ");

        int age;
        while (true) {
            try {
                age = Integer.parseInt(sc.nextLine());
                stu.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误, 请重新输入整数年龄: ");
            } catch (StudentAgeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(stu);

    }
}
