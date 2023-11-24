package A07_Polymorphism.Basic;

public class Demo {
    /*
        多态前提：
            1.有 继承 / 实现 关系
            2.有方法重写
            3.有父类引用指向子类对象
              有接口的引用指向实现类对象


        1.对象多态

            Animal a1 = new Dog();
            Animal a2 = new Cat();

            好处：方法的形参定义为父类类型，这个方法就可以接收到该父类的任意子类对象

        2.行为多态
            好排除：同一个方法，具有多种不同表现形式或形态的能力

-----------------------------------------------------------------------------

        多态弊端：
            不能调用子类的特有成员

     */
    public static void main(String[] args) {

        useAnimal(new Dog());
        useAnimal(new Cat());

    }

    public static void useAnimal(Animal a){
        a.eat();
    }

}
