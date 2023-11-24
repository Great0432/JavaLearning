package A11_Regex.Basic;

public class Practice {
    /*
        1.QQ号
            不能以0开头
            全部都是数字
            5~12位
        2.手机号
            必须是1开头
            第二位 : 3 4 5 6 7 8 9
            全都是数字, 必须是11位
        3.邮箱

     */
    public static void main(String[] args) {

        String qqRegex = "[1-9]\\d{4,11}";
        System.out.println("3381437992".matches(qqRegex));

        String phoneRegex = "[1][3-9]\\d{9}";
        System.out.println("15288886582".matches(phoneRegex));

        String emailRegex = "\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("great8520nnn@163.com".matches(emailRegex));

    }
}
