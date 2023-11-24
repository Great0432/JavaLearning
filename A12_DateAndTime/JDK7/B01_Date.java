package A12_DateAndTime.JDK7;

import java.util.Date;

public class B01_Date {
    public static void main(String[] args) {
        /*
            Date类 : 表示时间的类

            1.构造方法 :
                public Date() : 将当前时间,封装为Date日期对象
                public Date(long time) : 将时间毫秒值转换成Date日期对象
            2. 常见方法 :
                public long getTime() : 返回从1970年1月1日 00:00:00走到此刻的总的毫秒数
                public void setTime(long time) : 设置日期对象的时间为当前时间毫秒值对应的时间
         */
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(1000L);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970

        System.out.println(d1.getTime());
        System.out.println(d2.getTime());

        System.out.println("------------------------------");

        Date d3 = new Date();
        System.out.println(d3);
        d3.setTime(0L);
        System.out.println(d3);

    }
}