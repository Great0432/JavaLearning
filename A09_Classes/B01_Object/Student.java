package A09_Classes.B01_Object;


public class Student {

    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        //instanceof -- 判断一个对象是否属于特定的类型
        if(obj instanceof Student){
            //向下转型的目的，是为了调用子类特有的成员
            Student stu = (Student) obj;
            return stu.age == this.age && stu.name.equals(this.name);
        }else{
            return false;
        }
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
