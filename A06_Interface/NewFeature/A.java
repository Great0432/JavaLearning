package A06_Interface.NewFeature;

public interface A {

    default void method(){
        System.out.println("A...method");
    }

    static void function(){
        System.out.println("A...static...function");
    }

}
