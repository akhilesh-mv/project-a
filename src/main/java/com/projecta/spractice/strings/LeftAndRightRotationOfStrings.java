package com.projecta.spractice.strings;

/**
 * @Author akhil
 * @create 18/07/22 7:04 PM
 */
public class LeftAndRightRotationOfStrings {
    public static void main(String[] args) {
        String str = "codingninjas";
        int limit = 2;
        System.out.println(leftRotate(str, limit));
        System.out.println(rightRotate(str, limit));
    }

    public static String leftRotate(String str, int d) {
        return str.substring(d) + str.substring(0, d);
    }

    public static String rightRotate(String str, int d) {
        return str.substring(str.length() - d) + str.substring(0, str.length() - d);
    }
}
