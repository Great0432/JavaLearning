package A13_Exception;

public class StudentAgeException extends RuntimeException{
    /*
        自定义异常

            1. 自定义编译时异常
                a.定义一个异常类继承Exception
                b.重写构造器

            2. 自定义运行时异常
                a.定义一个异常类继承RuntimeException
                b.重写构造器
     */

    public StudentAgeException() {
    }

    public StudentAgeException(String message) {
        super(message);
    }
}
