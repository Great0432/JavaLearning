package A03_Inheritance.Simple;

public class Demo {
    public static void main(String[] args) {

        Coder c = new Coder();
        c.setName("Tom");
        c.setAge(12);
        c.setSalary(12000);
        c.setWorkDay(5);
        System.out.println(c.getName()+","+c.getAge()+","+c.getSalary()+","+c.getWorkDay());

        System.out.println("---------------");
        c.printNum();

        System.out.println("---------------");
        c.show();

    }


}
