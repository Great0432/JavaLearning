package A12_DateAndTime.JDK8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class B02_DateTimeFormatter {
    public static void main(String[] args) {
        /*
            DateTimeFormatter类 : 用于时间的格式化和解析

                1. 对象的获取 :
                    static DateTimeFormatter ofPattern(格式) : 获取格式对象
                2. 格式化 :
                    String format(时间对象) : 按照指定方式格式化
                3. 解析 :
                    LocalXxx.parse("解析字符串", 格式化对象);
         */
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("y年M月d日");

        //格式化
        String s = dtf.format(now);
        System.out.println(s);

        //解析
        String time = "2005年8月26日";
        LocalDate localDate = LocalDate.parse(time, dtf);//字符串的格式要和格式化对象的格式相同
        System.out.println(localDate);

    }
}
