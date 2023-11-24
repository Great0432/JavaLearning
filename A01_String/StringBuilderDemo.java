package A01_String;



public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append(123).append("ccc").append(true);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int len = sb.length();
        System.out.println(len);

        String s = sb.toString();
        System.out.println(s);

    }
}
