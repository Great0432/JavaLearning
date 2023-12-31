package A09_Classes.B04_System;

public class Demo {
    public static void main(String[] args) {
        /*
            System类常用方法:
                1.public static void exit(int status) : 终止当前运行的Java虚拟机, 非零表示异常终止(一般输入0)
                2.public static long currentTimeMills() : 返回当前系统的时间毫秒值
                                                        - 返回1970.1.1 0时0分0秒 到现在所经历的毫秒值
                1.public static void arrayCopy(Object src, int srcPos, Object dest, int destPos, int length) : 数组拷贝
                                              1. 数据源数组
                                              2.起始索引
                                              3.目的地数组
                                              4.起始索引
                                              5.拷贝的个数
         */

        testTime();

        int arr[] = {11,22,33,44,55};
        int[] destArr = new int[3];
        System.arraycopy(arr,1,destArr,0,3);
        for (int i = 0; i < destArr.length; i++) {
            System.out.println(destArr[i]);
        }

    }

    private static void testTime() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i <10000 ; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }
}
