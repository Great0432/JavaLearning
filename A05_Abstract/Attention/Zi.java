package A05_Abstract.Attention;

public class Zi extends Fu {

    public Zi(){
        super(); //如果抽象类没有构造方法，super不知道访问谁
    }

    int num = 20;

    @Override
    public void show() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
