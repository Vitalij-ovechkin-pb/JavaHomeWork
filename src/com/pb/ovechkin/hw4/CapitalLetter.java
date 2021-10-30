package com.pb.ovechkin.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println(toUp(str));
    }

    public static String toUp(String str) {
        StringBuilder str2 = new StringBuilder(str);
        if (Character.isAlphabetic(str.codePointAt(0)))
            str2.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++)
            if (Character.isAlphabetic(str.charAt(i)) && Character.isSpaceChar(str.charAt(i - 1)))
                str2.setCharAt(i, Character.toUpperCase(str.charAt(i)));

        return str2.toString();
    }

}