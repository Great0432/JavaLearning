package A08_AnonClass.Basic;

public class Demo {
    /*
        概述: 匿名内部类本质上是一个特殊的局部内部类（定义在方法内部）
        前提: 需要存在一个接口或类
        格式:
            new 类名/接口名(){

            }

            new 类名(){}  : 代表继承这个类
            new 接口名(){} : 代表实现这个接口
     */
    public static void main(String[] args) {

        // 方法的形参是接口类型,应该传入接口的实现类对象 (多态的形式)
        useInter(new InterImpl());

        // 使用匿名内部类的方式
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("Anon....");
            }
        });

    }

    public static void useInter(Inter i){
        /*
            1.创建一个实现类,传入实现类对象
            2.传入匿名内部类
         */
        i.show();
    }

}
