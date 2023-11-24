package A01_String;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);

        int len = sj.length();
        System.out.println(len);

        String s = sj.toString();
        System.out.println(s);
    }
}
