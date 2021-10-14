package com.pb.ovechkin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;

        System.out.println("Введите число");
        operand1 = scan.nextInt();
        if(operand1 >= 0 && operand1 <= 14){
            System.out.print("Число в диапазоне [0-14]");
        }else if(operand1 >= 15 && operand1 <= 35){
            System.out.print("Число в диапазоне [15-35]");
        }else if(operand1 >= 36 && operand1 <= 50){
            System.out.print("Число в диапазоне [36-50]");
        }else if(operand1 >= 51 && operand1 <= 100){
            System.out.print("Число в диапазоне [51-100]");
        }else{
            System.out.print("Число ни в одном из диапазонов");
        }
    }
}
