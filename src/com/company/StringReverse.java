package com.company;

public class StringReverse {



        public static void main(String [] args)
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.println("Bir yazı giriniz:");
            String str = kb.nextLine();

            System.out.println(StringUtil.reverse(str));
        }


    static class StringUtil {
        public static String reverse(String str)
        {
            String s = "";

            for (int i = str.length() - 1; i >= 0; --i)
                s += str.charAt(i);

            return s;
        }
    }
}
