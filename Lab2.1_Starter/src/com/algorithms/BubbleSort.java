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
public static void sort(int[] arrayToBeSorted){

    int n = arrayToBeSorted.length;

    int count = 0;

    for (int k = 1; k < n; k++){
        for (int j = 0; j < arrayToBeSorted.length-1; j++){
            count++; //counting each iteration of the array
            if (arrayToBeSorted[j] > arrayToBeSorted[j+1]){
                int tempIndexValue = arrayToBeSorted[j]; //placeholder for the greater index value
                arrayToBeSorted[j] = arrayToBeSorted[j+1];  //swapping greater value with next index
                arrayToBeSorted[j+1] = tempIndexValue; //swapping lesser value with greater index
            }
        }
    }
    System.out.println("Iterations for array of length " + arrayToBeSorted.length + ": " + count );
}
    
}
