package A09_Classes.B06_WrapperClass;

public class Practice01 {
    /*
        已知字符串 String s = “10，50，30，20，40”
        请将该字符串转换为整数存入数组
        随后求出最大值打印在控制台
     */
    public static void main(String[] args) {

        String s = "10,50,30,20,40";
        //根据逗号分割
        String[] arr = s.split(",");

        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            max = Math.max(num[i], max);
        }

        System.out.println(max);
    }
}
