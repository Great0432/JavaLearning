package A09_Classes.B06_WrapperClass;

public class Demo {
    public static void main(String[] args) {
        /*
            包装类 : 将 基本数据类型 包装成类, 成为 引用数据类型

            常用方法：
                String toBinaryString(int i) : 转二进制
                String toOctalString(int i) : 转八进制
                String toHexString(int i) : 转十六进制
                int parseInt(String s) : 将数字字符串转换为数字
         */

        String s = "123";
        int num = Integer.parseInt(s) + 100;
        System.out.println(num);

    }
}
