package A10_Algorithm.B03_BinarySearch;

public class Demo {
    public static void main(String[] args) {
        /*
            二分查找(折半查找) : 必须是排好序的数据
         */

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        int index = binarysearch(arr, 55);
        System.out.println(index);

    }

    private static int binarysearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int mid;

        while (min <= max){
            mid = (min + max)/2;
            if(num > arr[mid]){
                min = mid + 1;
            }else if(num < arr[mid]){
                max = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
