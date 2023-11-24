package A10_Algorithm.B02_SelectionSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        /*
            选择排序

            第i轮确定第i小的数放在第i个位置
         */
        int[] arr = {22,55,33,11,44};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
