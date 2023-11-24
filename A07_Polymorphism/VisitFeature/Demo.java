package A07_Polymorphism.VisitFeature;

public class Demo {
    /*
        多态的成员访问特点：

        1.成员变量：编译看左边(父类)，运行看右边(父类)

        2.成员方法：编译看左边(父类)，运行看右边(子类)

            在编译的时候，会检查父类中有没有这个方法
                有：编译通过，但是运行的时候会执行子类的方法逻辑
                没有：编译出错

                    原因：防止调用的方法在父类中是一个抽象方法

----------------------------------------------------------------------

        多态创建对象，调用静态成员：

            静态的成员，推荐类名进行调用
            细节：静态的成员，使用对象名调用，这是一种假象
                - 生成字节码(.class)文件后，会自动将对象名调用改成类名调用

     */
    public static void main(String[] args) {

        //使用多态创建对象
        Fu f = new Zi();
        System.out.println(f.num); // 输出10， 访问的是父类的num
        f.show();

        Fu.print();

        System.out.println("----------------------");

        Inter i = new InterImpl();
        i.method();

    }
}
