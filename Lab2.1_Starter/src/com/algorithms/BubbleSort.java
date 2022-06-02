package com.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
       int[] input = {4, 15, 2, 6, 9, 22, 13};
       System.out.println(Arrays.toString(input));
       sort(input);
       System.out.println(Arrays.toString(input));
    }

/*
bubbleSort(array)
   n = length(array)
   for (k = 1 until n)
   for (j = 0 until length-1)
     if(array[j] > array[j + 1])
       swap(array, j, j + 1)
*/
    public static void sort(int[] numbers){
    // implement pseudo-code above
        int n = numbers.length;
        int iterations = 0;
//        System.out.println("something");
        for (int k = 0; k <= n; k++){
//            System.out.println("something");
            for (int j = 0; j < n-1; j++ ){
                iterations+=1;
                System.out.println(" after sort first value " + numbers[j] + "second value " + numbers[j + 1] );

                if(numbers[j] > numbers[j + 1]){
                    int firstValue = numbers[j];
                    int secondValue = numbers[j + 1];
                    numbers[j + 1] = firstValue;
                    numbers[j] = secondValue;
                }else if (numbers[j] < numbers[j + 1]){
                    System.out.println("no sort needed after sort first value " + numbers[j] + "second value " + numbers[j + 1] );
                    continue;
                }
                System.out.println(" after sort first value " + numbers[j] + "second value " + numbers[j + 1] );
//                System.out.println("iterations:"+ iterations);
            }
        }
    }
    
}
