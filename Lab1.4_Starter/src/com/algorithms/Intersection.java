package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }



    public List<Integer> getIntersectingValuesFast(int[]listA, int[]listB) {
        List<Integer> intersectionValues = new ArrayList<>();

        int iterationCount = 0;

        Arrays.sort(listA);
        Arrays.sort(listB);

        int aIndex = 0;
        int bIndex = 0;

        while (aIndex < listA.length && bIndex < listB.length){
            iterationCount++; //counting each iteration through the lists for complexity measuring

            if (listA[aIndex] == listB[bIndex]) {
                intersectionValues.add(listA[aIndex]);
                aIndex++;
                bIndex++;
            }
            else if (listA[aIndex] < listB[bIndex]) {
                aIndex++;
            }
            else {
                bIndex++;
            }
        }
        System.out.println("Total Iterations: " + iterationCount);
        return intersectionValues;
    }
    public static void main(String args[]) {
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.getIntersectingValuesFast(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
    }
}
