package A03_Inheritance.ThisAndSuper;

public class A {

    int a;
    int b;
    int c;
    int d;

    public A() {
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //版本更新：新增一个成员变量
    public A(int a, int b, int c, int d){
        this(a,b,c);
        this.d = d;
    }

}
