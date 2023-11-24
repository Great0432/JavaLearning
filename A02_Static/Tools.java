package A02_Static;

public class Tools {

    private Tools(){}

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length-1] + "]");
    }
}
