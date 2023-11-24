package A12_DateAndTime.JDK7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B02_SimpleDateFormat {
                                          //TODO: 异常
    public static void main(String[] args) throws ParseException {
        /*
            SimpleDateFormat类 : 用于日期格式化

            1. 构造方法 :
                public SimpleDateFormat() : 创建一个日期格式化对象, 使用[默认模式]
                public SimpleDateFormat(String pattern) : 创建一个日期格式化对象, [手动指定模式]
            2. 常用方法 :
                public final String format(Date date) : 将日期对象, 转换为字符串
                public final Date parse(String source) : 将日期字符串, 解析为日期对象
         */
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();

        String result1 = sdf1.format(date);
        System.out.println(result1);

        String result2 = sdf2.format(date);
        System.out.println(result2);

        System.out.println("------------------------------");

        String day = "2023年11月21日";
        Date parse = sdf2.parse(day);//day的格式和sdf2的格式必须相同
        System.out.println(parse);

    }
}
