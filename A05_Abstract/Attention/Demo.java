package A05_Abstract.Attention;

public class Demo {
    /*
        注意事项：
            1.抽象类不能实例化(不能创建对象)
            2.抽象类存在构造方法
                - 交给子类，使用super访问
            3.抽象类中可以存在普通方法
                - 可以让子类继承继续使用
            4.抽象类的子类
                1).要么重写抽象类中的所有抽象方法
                2).要么是抽象类
     */
    public static void main(String[] args) {

        Zi z = new Zi();
        z.method(); // 抽象类中的普通方法
        z.show();

    }
}
