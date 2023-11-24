package A12_DateAndTime.JDK8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class B04_Tools {
    //用于计算时间间隔的工具类

    //Period类 : 年, 月, 日

    //Duration类 : 天, 时, 分, 秒, 纳秒

    //ChronoUnit类
    /*
        ChronoUnit类 : 所有单位

            ChronoUnit.XXX.between(参数1, 参数2)

     */
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate otherDate = LocalDate.of(2005, 3, 30);

        System.out.println(ChronoUnit.MONTHS.between(otherDate, now));

    }
}
