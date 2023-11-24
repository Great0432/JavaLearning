package A06_Interface.NewFeature;

public class InterImpl01 implements Inter, A{
    @Override
    public void show() {
        System.out.println("01...show");
    }

    @Override
    public void print() {
        System.out.println("01...print");
    }

    @Override
    public void method() { // 去掉了default关键字
        A.super.method(); // 使用接口A中的method方法
        Inter.super.method(); // 使用接口Inter中的method方法
        System.out.println("01...method"); // 方法重写
    }
}
