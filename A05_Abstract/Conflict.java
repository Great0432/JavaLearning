package A05_Abstract;

public class Conflict {

/*
    关键字冲突：
        final：被abstract修饰的方法，强制要求子类重写，被final修饰的方法子类不能重写

            public final abstract void show(){}

-----------------------------------------------------------------------------------

        private：被abstract修饰的方法，强制要求子类重写，被private修饰的方法子类不能重写

            private abstract void show(){}

-----------------------------------------------------------------------------------

        static：被static修饰的方法可以通过使用类名进行调用，类名调用抽象方法没有意义

            public abstract class A{
                public abstract void show(){}
            }

                A.show();
 */

}
