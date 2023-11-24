package A06_Interface.Basic;

public class Demo {

    /*
        接口：体现的思想就是声明【规则】

        思路：如果一个类所有的组成都是抽象方法
            - 没有成员变量
            - 没有普通方法
            这种类会设计成接口，因为这个类存在的唯一价值就只是声明规则了

        注意：接口不允许实例化
             接口和类之间是实现关系

         实现类：
            1.重写所有抽象方法
            2.将实现类变成抽象类（少见）

     */
    public static void main(String[] args) {

        InterfaceImpl ii = new InterfaceImpl();
        ii.show();
        ii.method();

    }
}
