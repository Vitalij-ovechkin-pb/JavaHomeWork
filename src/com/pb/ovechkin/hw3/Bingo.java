package com.pb.ovechkin.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int userNum, trysCount = 0;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 100");
        int unknownNum = rand.nextInt(101);
        for (; ;)
        {
            trysCount++;
            System.out.print("Жги: ");
            if (in.hasNextInt()) {
                userNum = in.nextInt();
                if (userNum > unknownNum) {
                    System.out.println("Многовато, давай поменьше");
                } else if (userNum < unknownNum) {
                    System.out.println("Маловато, давай побольше");
                } else {
                    System.out.println("Ништяк! Угадал с" + trysCount + "попытки");
                    break;
                }
            } else if (in.hasNextLine()) {
                if (in.hasNext("exit")) {
                    System.out.println("Игра окончена!");
                } else {
                    System.out.println("Игра окончена, потому что буквы");
                }
                break;
            }
            System.out.println("Устал играть? Пиши - exit.");
            System.out.println("Попытка № " + trysCount);
        }
    }
}