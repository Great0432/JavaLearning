package A14_Collection.B02_Generics;

public class Demo02 {
    /*
        泛型方法 :
            1. 非静态的方法 : 内部的泛型, 会根据类的泛型去匹配
            2. 静态的方法 : 静态方法中如果加入了泛型, 必须声明自己独立的类型
                        - 时机 : 在调用方法, 传入实际参数的时候, 确定到具体的类型
     */
    public static void main(String[] args) {

        //泛型只能编写引用数据类型
        String[] arr1 = {"aaa", "bbb", "ccc"};
        Integer[] arr2 = {11, 22, 33};
        Double[] arr3 = {1.1, 2.2, 3.3};

        printArr(arr1);
        printArr(arr2);
        printArr(arr3);
    }

    public static <T> void printArr(T[] arr){

        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");

    }
}
