package A10_Algorithm.B01_BubbleSort;

import java.util.Arrays;

public class Demo {
    /*
        冒泡排序
     */
    public static void main(String[] args) {

        int[] arr = {22,55,33,44,11};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
