package A12_DateAndTime.JDK7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class B03_Calendar {
    public static void main(String[] args) throws ParseException {
        /*
            Calendar : 代表的是系统此刻时间对应的日历, 通过它可以单独获取、修改时间中的年、月、日、时、分、秒等
                       是一个抽象类

            1. 创建对象 :
                public static Calendar getInstance() : 获取当前时间的日历对象
            2. 常用方法 :
                public int get(int field) : 取日历中的某个字段信息
                public void set(int field, int value) : 修改日历的某个字段信息
                public void add(int field, int amount) : 为某个字段增加/减少指定的值

                public final Date getTime() : 获取日期对象
                public final setTime(Date date) : 给日历设置日期对象

            注意 :
                1. Calendar中的月份是 0~11
                2. 星期日是一周中的第一天
         */

        DayOfYear();

        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        System.out.println("------------------------------");

        c.set(Calendar.YEAR,2022);
        System.out.println(c.get(Calendar.YEAR));

        c.set(2002,8,10); // 2002年9月10号
        System.out.println(c.get(Calendar.YEAR));

        System.out.println("------------------------------");

        c.add(Calendar.YEAR,22);
        System.out.println(c.get(Calendar.YEAR));

    }

    //输入一个日期字符串, 输出是一年中的第几天
    private static void DayOfYear() throws ParseException {
        System.out.println("请输入日期(xxxx年xx月xx日) : ");
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sdf.parse(dateStr);

        Calendar c = Calendar.getInstance();
        c.setTime(parse);
        System.out.println("这一天是这一年中的第" + c.get(Calendar.DAY_OF_YEAR) + "天");
    }
}
