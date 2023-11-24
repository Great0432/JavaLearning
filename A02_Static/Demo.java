package A02_Static;

public class Demo {
    /*
    static特点：
        1.被类的所有对象共享
        2.多了一种调用方式，可以通过类名进行调用
        3.随着类的加载而加载，优先于对象存在
     */
    public static void main(String[] args) {

        User user1 = new User();
        user1.name = "Tom";
        user1.age = 12;

        User user2 = new User();
        user2.name = "Mike";
        user2.age = 58;

        User.school = "电专";
        System.out.println(user1.name + "," + user1.age + "," + User.school);
        System.out.println(user2.name + "," + user2.age + "," + User.school);
        User.eat();


        System.out.println("-------------------------------");

        int[] arr = {11,22,33};

        System.out.println(Tools.getMax(arr));
        System.out.println(Tools.getMin(arr));
        Tools.printArr(arr);
    }
}
