package A09_Classes.B07_ArraysTools;

import java.util.Arrays;

public class Demo {
    /*
        String toString(类型[] a)
        boolean equals(类型[] a, 类型[] b)
        int binarySearch(int[] a, int key) -- 以int为例
        void sort(类型[] a)
            TODO: A10_B03 二分查找（折半查找）
     */
    public static void main(String[] args) {

        int[] arr1 = {11,22,33,44,55};
        int[] arr2 = {11,22,33,44,66};

        //将数组元素拼接为带有格式的字符串
        String s = Arrays.toString(arr1);
        System.out.println(s);

        //比较两个数组内容是否相同
        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println(flag);

        //查找元素在数组中的索引
            //使用二分查找法，必须保证数组的元素是排好序的
        int i1 = Arrays.binarySearch(arr1, 33);
        System.out.println(i1);
        //如果查找的元素不存在，返回 (-(插入点)-1)
            //插入点 : 如果存在，则该元素的索引为插入点
        int i2 = Arrays.binarySearch(arr1, 66);
        System.out.println(i2);

        int[] nums = {22,11,55,33,44};
        int n = Arrays.binarySearch(nums, 11);
        System.out.println(n);

        //对数组进行默认升序排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
