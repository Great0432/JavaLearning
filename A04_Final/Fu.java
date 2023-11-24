package A04_Final;

public class Fu {

    /*
        final int num = 10;
     */

    final int num;

    public Fu(){
        num = 10;
    }

    public final void show(){
        System.out.println("父类中非常重要，不能被修改的方法");
    }
}
