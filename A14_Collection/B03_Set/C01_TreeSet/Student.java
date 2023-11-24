package A14_Collection.B03_Set.C01_TreeSet;

public class Student implements Comparable<Student>{

    @Override
    public int compareTo(Student o) {
        //实现对年龄的正序排列  this.xx - o.xx
        int ageResult = age - o.age;
        //如果年龄相同, 对姓名进行排序
        int nameResult = ageResult == 0 ? name.compareTo(o.name) : ageResult;
        //如果姓名, 年龄都相同, 也要存下来
        return nameResult == 0 ? 1 : nameResult;
    }


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

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
