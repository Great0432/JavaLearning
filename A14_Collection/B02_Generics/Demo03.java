package A14_Collection.B02_Generics;



public class Demo03 {
    /*
        泛型接口 :
            1. 实现类, 实现接口的时候确定到具体的类型
            2. 实现类实现接口, 没有指定具体类型, 就让接口的泛型, 跟着类的泛型去匹配
                例如 : List, ArrayList
     */
    public static void main(String[] args) {

    }
}

interface Inter <E> {
    void show(E e);
}

class ImplA implements Inter<String>{
    @Override
    public void show(String s) {

    }
}

class ImplB<E> implements Inter<E>{
    @Override
    public void show(E e) {

    }
}