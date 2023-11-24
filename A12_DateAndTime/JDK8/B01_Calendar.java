package A12_DateAndTime.JDK8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class B01_Calendar {
    public static void main(String[] args) {
        /*
            LocalDate, LocalTime, LocalDateTime类 :

            1. 创建
                xxx now()
                xxx of(参数, 参数...)

            2. 修改 :    Xxx代表Hour(s), Minute(s), Second(s)等
                withXxx :                   修改时间, 返回新的时间对象
                plusXxx :                   把某个信息加多少, 返回新时间对象
                minusXxx :                  把某个信息减多少, 返回新时间对象
                equals, isBefore, isAfter : 判断两个时间对象是否相等, 在前还是在后

            3. 转换 由LocalDateTime转
                toLocalDate()
                toLocalTime()

            4. 注意 :
                都是不可变的,返回的都是新的对象
         */
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime setTime = LocalDateTime.of(2005, 8, 26, 17, 30, 01);
        System.out.println(setTime);

        System.out.println(now.getMonthValue() + "月");

    }
}
