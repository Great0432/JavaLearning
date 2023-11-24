package A12_DateAndTime.JDK7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B02_SimpleDateFormatTest {
    /*
        计算用户活了多少天
     */
    public static void main(String[] args) throws ParseException {

        //键盘录入生日(日期字符串)
        System.out.println("请输入您的生日(xxxx年xx月xx日) : ");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.nextLine();

        //使用指定模式创建SimpleDateFormat对象,将生日日期字符串转换为Date日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdayDate = sdf.parse(birthday);

        //得到当前时间
        Date today = new Date();

        //计算用户活了多少毫秒
        long time = today.getTime() - birthdayDate.getTime();

        System.out.println("您已经来到这个世界" + time / 1000 / 60 / 60 / 24 + "天!");

    }
}
