package com.yacoding.dp.flyweight;

/**
 * @Author yaCoding
 * @create 2022-05-28 上午 11:40
 */

public class TestString {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);//t
        System.out.println(s1 == s3);//f
        System.out.println(s3 == s4);//f
        System.out.println(s3.intern() == s1);//t
        System.out.println(s3.intern() == s4.intern());//t

    }
}
