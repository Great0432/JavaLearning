package A08_AnonClass.Lambda;

public class Demo {
    /*
        Lambda表达式: JDK8开始后的一种新语法形式

            作用: 简化匿名内部类的代码写法
            格式: () -> {}

                () : 匿名内部类被重写方法的形参列表
                {} : 被重写方法的方法体代码

        注意事项:

            Lambda表达式只允许操作函数式接口,即有且仅有一个抽象方法的接口

                可以使用 @FunctionalInterface 注解来检查

        Lambda表达式的省略写法:
            1.参数类型可以省略不写
            2.如果只有一个参数,参数类型可以省略,同时()也可以省略
            3.如果Lambda表达式的方法体代码只有一行代码
                可以省略大括号不写, 同时要省略分号
                此时,如果这条代码是return语句,必须省略return不写,同时也必须省略 ";" 不写

     */
    public static void main(String[] args) {

        // 原本代码
        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写show方法");
            }
        });

        //使用Lambda表达式
        useInterA(() -> System.out.println("Lambda表达式重写show方法"));

    }

    public static void useInterA(InterA i){
        i.show();
    }

}
