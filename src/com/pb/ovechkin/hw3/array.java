package com.pb.ovechkin.hw3;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
                int[] array = new int[] {50, 30, -20, -10, 40, 0, 20, -30, -40, 10};
                System.out.println("Массив:");
                System.out.println(Arrays.toString(array));
                int fullSum = 0;
                int posSum = 0;
                for(int i = 0; i < array.length; i++){
                    fullSum = fullSum + array[i];
                    if (array[i] > 0){
                        posSum = posSum + array[i];
                    }
                }
                System.out.println("Сумма массива:");
                System.out.println(fullSum);
                System.out.println("Сумма положительных значений массива:");
                System.out.println(posSum);

                boolean isSort = false;
                int[] secArray = new int[array.length];
                while(!isSort) {
                    isSort = true;
                    for (int i = 0; i < array.length-1; i++) {
                        if(array[i] > array[i+1]){
                            isSort = false;
                            secArray[i] = array[i];
                            array[i] = array[i+1];
                            array[i+1] = secArray[i];
                        }
                    }
                }
                System.out.println("Сортировка пузырьком:");
                System.out.println(Arrays.toString(array));
            }
        }
