package A06_Interface.NewFeature;

public interface Inter {

    void show();
    void print();

    default void method(){ // 省略 public
        System.out.println("Inter...method");
    }

}
