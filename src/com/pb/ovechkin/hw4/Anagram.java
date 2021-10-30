package com.pb.ovechkin.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
       String s1;
       String s2;
       Scanner in = new Scanner(System.in);

       System.out.println("Введите первую строку:");
       s1 = in.nextLine();

       System.out.println("Введите вторую строку:");
       s2 = in.nextLine();

       String result = isAnagram(s1, s2);
        System.out.println(result);
    }
    public static String isAnagram(String s1, String s2){
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        String answer = "Анаграмма";

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2))
            answer = "Анаграмма";
        else
            answer = "Не анаграмма";

        return answer;
    }
}
