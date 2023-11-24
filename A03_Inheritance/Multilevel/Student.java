package A03_Inheritance.Multilevel;

public class Student extends Person{

    private double score;


    public void study(){
        System.out.println("姓名为"+getName()+"，年龄为"+getAge()+"岁，成绩为"+score+"分的学生正在学习");
    }


    public Student(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
