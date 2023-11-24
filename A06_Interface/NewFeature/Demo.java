package A06_Interface.NewFeature;

public class Demo {
    /*
        JDK8新特性：
            1.允许定义非抽象方法，需要加入default关键字

                - 作用:解决接口的升级问题
                - 注意事项:
                    1.public可以省略, 但是default不能省略
                    2.默认方法, 实现类是允许重写的, 但是需要在重写方法去掉default关键字
                    3.如果实现了多个接口, 多个接口中存在相同的默认方法, 实现类必须重写默认方法

            2.允许定义静态方法

                - 注意事项:
                    1.public可以省略, 但是static不能省略
                    2.接口中的静态方法,只允许接口名进行调用,不允许实现类通过对象调用


        JDK9新特性:
            接口中允许定义私有方法

                接口中带有逻辑的方法有重复出现的部分,就可以把重复的部分抽取出来,不需要重复编写
                又不想被别的方法调用,因此 private

                可以加 static
     */
    public static void main(String[] args) {

        InterImpl01 a = new InterImpl01();
        a.method();

        A.function();

    }
}
