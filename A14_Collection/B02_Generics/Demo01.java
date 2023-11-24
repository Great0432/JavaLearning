package A14_Collection.B02_Generics;

public class Demo01 {
    /*
    泛型类
        常见的泛型标识符 : E T K V
            E : Element
            T : Type
            K : Key
            V : Value

        清楚不同的泛型, 在什么时候能确定到具体的类型

        泛型类 : 创建对象的时候
     */
    public static void main(String[] args) {

        Student<String> stu = new Student<>();
        stu.setE("Tom");

    }
}

class Student<E>{
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
