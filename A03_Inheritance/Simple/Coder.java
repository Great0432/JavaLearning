package A03_Inheritance.Simple;

public class Coder extends Employee {

    private int workDay;
    int num = 20;

    public void printNum(){
        int num = 30;
        System.out.println(num);//打印方法中的num
        System.out.println(this.num);//打印子类中的num
        System.out.println(super.num);//打印父类中的num
    }

    //方法重写
    public void show(){
        System.out.println("Zi");
        super.show();
    }






    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }





}
