package A03_Inheritance.Multilevel;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("姓名为"+getName()+"，年龄为"+getAge()+"岁的老师正在讲课");
    }

}
