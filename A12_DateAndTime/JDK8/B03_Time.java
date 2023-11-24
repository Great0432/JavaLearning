package A12_DateAndTime.JDK8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class B03_Time {

    //Instant类
    /*
        Instant类 : 用于表示时间的对象, 类似之前学习的Date

            atZone(ZoneId zone) : 指定时区
            atZone(ZoneId.of("时区"))
     */

    //ZoneId类
    /*
        ZoneId类 :
            常见方法 :
                1.static Set<String> getAvailableZoneIds() : 获取Java中支持的所有时区
                2.static ZoneId systemDefault() : 获取系统默认时区
                3.static ZoneId of(String zoneId) : 获取一个指定时区
     */

    //ZonedDateTime类 :
    /*
        ZonedDateTime类 : 带时区的时间对象

     */

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);//输出的时间是格林尼治时间

        //获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取上海时区的时间
        ZoneId of = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime = Instant.now().atZone(of);
        System.out.println(zonedDateTime);

    }
}
