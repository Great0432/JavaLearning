package A03_Inheritance.Multilevel;

public class Demo {
    public static void main(String[] args) {

        Teacher t = new Teacher("Tom",30);
        t.teach();

        Student s = new Student("Mike",12,96.5);
        s.study();

    }
}
