package A09_Classes.B06_WrapperClass;

public class Practice02 {
    /*
        看程序说结果
     */
    public static void main(String[] args) {

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);//true

        Integer i3 = 129;
        Integer i4 = 129;
        System.out.println(i3 == i4);//false

    /*
        自动装箱的时候，如果数据范围时 -128 ~ 127 ， ==号比较的结果是true，反之都是false

        自动装箱的原理 ：自动调用了Integer.valueOf（）

            public static Integer valueOf(int i) {
                if (i >= IntegerCache.low && i <= IntegerCache.high)
                    return IntegerCache.cache[i + (-IntegerCache.low)];
                return new Integer(i);
            }

        如果装箱的数据，不在 -128 ~ 127 之间，会重新创建对象
        如果装箱的数据，在 -128 ~ 127 之间，不会创建新的对象，而是从底层的数组中取出提前创建好的Integer对象返回

        在范围内比较的是元素内容，不在范围比较的是对象地址

     */
    }
}
