package A09_Classes.B05_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
    public static void main(String[] args) {
        /*
            BigDecimal类 : 解决小数运算中,出现的不精确问题

            创建对象:
                public BigDecimal(double val) : 不推荐,无法保证小数运算的精确
                ------------------------------------------------------------------
                public BigDecimal(String val) :
                public static BigDecimal.valueOf(double val) :

            常用成员方法 :
                public BigDecimal add(BigDecimal b) : 加法
                public BigDecimal subtract(BigDecimal b) : 减法
                public BigDecimal multiply(BigDecimal b) : 乘法
                public BigDecimal divide(BigDecimal b) : 除法
                public BigDecimal divide(另一个BigDecimal对象, 精确几位, 舍入模式) : 除法

         */

        BigDecimal bd1 = BigDecimal.valueOf(-10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        BigDecimal result = bd1.divide(bd2, 2, RoundingMode.HALF_UP);

        double v = result.doubleValue();
        double v_abs = Math.abs(v);
        System.out.println(v_abs);

    }
}
